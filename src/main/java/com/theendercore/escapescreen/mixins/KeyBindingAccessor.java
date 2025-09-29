package com.theendercore.escapescreen.mixins;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(KeyMapping.class)
public interface KeyBindingAccessor {

    @Accessor("defaultKey")
    InputConstants.Key escpe_screen_getBoundKey();
}
