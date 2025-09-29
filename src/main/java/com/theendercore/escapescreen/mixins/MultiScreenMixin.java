package com.theendercore.escapescreen.mixins;

import com.mojang.realmsclient.gui.screens.RealmsLongRunningMcoTaskScreen;
import com.mojang.realmsclient.gui.screens.RealmsTermsScreen;
import com.mojang.realmsclient.gui.screens.RealmsUploadScreen;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screens.BackupConfirmScreen;
import net.minecraft.client.gui.screens.ConfirmScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import static com.theendercore.escapescreen.EscapeScreenClient.newEscKey;
import static com.theendercore.escapescreen.EscapeScreenClient.newEscape;


@Environment(EnvType.CLIENT)
@Mixin({BackupConfirmScreen.class,
        RealmsUploadScreen.class, RealmsTermsScreen.class, RealmsLongRunningMcoTaskScreen.class,
        ConfirmScreen.class})
public abstract class MultiScreenMixin {
    @ModifyConstant(method = "keyPressed", constant = @Constant(intValue = 256))
    public int keyPressed(int constant) {
        return newEscKey.isUnbound() ? constant : newEscape();
    }
}
