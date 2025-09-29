package com.theendercore.escapescreen;

import com.theendercore.escapescreen.mixins.KeyBindingAccessor;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;


public class EscapeScreenClient implements ClientModInitializer {

    public static KeyBinding newEscKey = KeyBindingHelper.registerKeyBinding(
            new KeyBinding("key.new_esc.esc", -1, KeyBinding.Category.INVENTORY)
    );

    @Override
    public void onInitializeClient() {
    }

    public static int getCode(KeyBinding key) {
        return ((KeyBindingAccessor) key).escpe_screen_getBoundKey().getCode();
    }
}
