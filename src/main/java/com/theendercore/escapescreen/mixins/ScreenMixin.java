package com.theendercore.escapescreen.mixins;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import static com.theendercore.escapescreen.EscapeScreenClient.newEscKey;

@Environment(EnvType.CLIENT)
@Mixin(Screen.class)
public class ScreenMixin {
    @Inject(method = "keyPressed", at = @At("HEAD"), cancellable = true)
    public void keyPressed(int keyCode, int scanCode, int modifiers, CallbackInfoReturnable<Boolean> cir) {
        if (newEscKey.matchesKey(keyCode, scanCode) && this.shouldCloseOnEsc()) {
            this.close();
            cir.setReturnValue(true);
        }
    }

    @Shadow
    public void close() {
    }

    @Shadow
    public boolean shouldCloseOnEsc() {
        return false;
    }
}


