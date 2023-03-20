package com.theendercore.escapescreen.mixins;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.option.ControlsListWidget;
import net.minecraft.client.gui.screen.option.GameOptionsScreen;
import net.minecraft.client.gui.screen.option.KeybindsScreen;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static com.theendercore.escapescreen.EscapeScreenClient.newEscKey;

@Environment(EnvType.CLIENT)
@Mixin(KeybindsScreen.class)
public class KeybindsScreenMixin extends GameOptionsScreen {
    @Shadow
    public KeyBinding selectedKeyBinding;
    @Shadow

    public long lastKeyCodeUpdateTime;
    @Shadow
    private ControlsListWidget controlsList;
    public KeybindsScreenMixin(Screen parent, GameOptions gameOptions, Text title) {
        super(parent, gameOptions, title);
    }


    @Inject(method = "keyPressed", at = @At("HEAD"), cancellable = true)
    public void keyPressed(int keyCode, int scanCode, int modifiers, CallbackInfoReturnable<Boolean> cir) {
        if (this.selectedKeyBinding != null) {
            if (newEscKey.matchesKey(keyCode, scanCode)) {
                this.gameOptions.setKeyCode(this.selectedKeyBinding, InputUtil.UNKNOWN_KEY);
            } else {
                this.gameOptions.setKeyCode(this.selectedKeyBinding, InputUtil.fromKeyCode(keyCode, scanCode));
            }
            this.selectedKeyBinding = null;
            this.lastKeyCodeUpdateTime = Util.getMeasuringTimeMs();
            this.controlsList.update();
            cir.setReturnValue(true);
        } else {
            cir.setReturnValue( super.keyPressed(keyCode, scanCode, modifiers));
        }
    }

}
