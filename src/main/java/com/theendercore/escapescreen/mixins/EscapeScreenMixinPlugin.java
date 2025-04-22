package com.theendercore.escapescreen.mixins;

import net.fabricmc.loader.api.FabricLoader;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.Objects;

public class EscapeScreenMixinPlugin implements IMixinConfigPlugin {

    @Override
    public void onLoad(String mixinPackage) {
    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        if (Objects.equals(mixinClassName, "com.theendercore.escapescreen.mixins.IPlatformHelperMixin")){
            return FabricLoader.getInstance().isModLoaded("controlling");
        }
        return true;
    }

    @Override
    public void acceptTargets(java.util.Set<String> myTargets, java.util.Set<String> otherTargets) {
    }

    @Override
    public java.util.List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
    }

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
    }
}

