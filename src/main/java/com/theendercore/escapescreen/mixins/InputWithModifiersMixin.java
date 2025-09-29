package com.theendercore.escapescreen.mixins;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.client.input.InputWithModifiers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

import static com.theendercore.escapescreen.EscapeScreenClient.newEscape;

@Mixin(InputWithModifiers.class)
public interface InputWithModifiersMixin {
    @Shadow
    int input();

    @ModifyReturnValue(method = "isEscape", at = @At("RETURN"))
    default boolean addNewEscKey(boolean original) {
        return original || newEscape() == input();
    }
}
