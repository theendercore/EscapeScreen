package com.theendercore.escapescreen.mixins;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.KeyboardHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import static com.theendercore.escapescreen.EscapeScreenClient.getCode;
import static com.theendercore.escapescreen.EscapeScreenClient.newEscKey;

@Environment(EnvType.CLIENT)
@Mixin(KeyboardHandler.class)
public abstract class KeyboardMixin {
//    @ModifyConstant(method = "onKey", constant = @Constant(intValue = 256))
//    public int keyPressed(int constant, long window, int key, int scancode) {
//        if (!newEscKey.isUnbound() && newEscKey.matchesKey(key, scancode)) {
//            return getCode(newEscKey);
//        }
//        return constant;
//    }
}
