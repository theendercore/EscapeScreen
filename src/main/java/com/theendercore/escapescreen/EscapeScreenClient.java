package com.theendercore.escapescreen;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

import static net.minecraft.client.option.KeyBinding.UI_CATEGORY;

public class EscapeScreenClient implements ClientModInitializer {

    public static KeyBinding newEscKey = KeyBindingHelper.registerKeyBinding(
            new KeyBinding(
                    "key.new_esc.esc",
                    InputUtil.UNKNOWN_KEY.getCode(),
                    UI_CATEGORY
            )
    );

    @Override
    public void onInitializeClient() {}
}
