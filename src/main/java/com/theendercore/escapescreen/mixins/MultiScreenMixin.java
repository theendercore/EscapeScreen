package com.theendercore.escapescreen.mixins;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screens.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import static com.theendercore.escapescreen.EscapeScreenClient.getCode;
import static com.theendercore.escapescreen.EscapeScreenClient.newEscKey;

@Environment(EnvType.CLIENT)
@Mixin({Screen.class, /*KeybindsScreen.class, CreativeInventoryScreen.class, AnvilScreen.class, ConfirmScreen.class,
        ChatScreen.class, SleepingChatScreen.class, RealmsLongRunningMcoTaskScreen.class, RealmsTermsScreen.class,
        RealmsUploadScreen.class, RealmsSelectFileToUploadScreen.class, BackupPromptScreen.class*/})
public abstract class MultiScreenMixin {
//    @ModifyConstant(method = "keyPressed", constant = @Constant(intValue = 256))
//    public int keyPressed(int constant, int keyCode, int scanCode) {
//        if (!newEscKey.isUnbound() && newEscKey.matchesKey(keyCode, scanCode)) {
//            return getCode(newEscKey);
//        }
//        return constant;
//    }
}
