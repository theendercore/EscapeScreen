package com.theendercore.escapescreen.mixins;

import com.blamejared.controlling.client.NewKeyBindsScreen;
import com.blamejared.controlling.platform.IPlatformHelper;
import net.minecraft.client.option.GameOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import static com.theendercore.escapescreen.EscapeScreenClient.getCode;
import static com.theendercore.escapescreen.EscapeScreenClient.newEscKey;

@Mixin(IPlatformHelper.class)
public interface IPlatformHelperMixin {
//    @ModifyConstant(method = "handleKeyPress", constant = @Constant(intValue = 256))
//    default int keyPressed(int constant, NewKeyBindsScreen screen, GameOptions options, int key, int scancode, int mods) {
//        if (!newEscKey.isUnbound() && newEscKey.matchesKey(key, scancode)) {
//            return getCode(newEscKey);
//        }
//        return constant;
//    }
}
