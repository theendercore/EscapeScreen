package com.theendercore.escapescreen;

import com.theendercore.escapescreen.mixins.KeyBindingAccessor;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;


public class EscapeScreenClient implements ClientModInitializer {

    public static KeyMapping newEscKey = KeyBindingHelper.registerKeyBinding(
            new KeyMapping("key.new_esc.esc", -1, KeyMapping.Category.INVENTORY)
    );

    @Override
    public void onInitializeClient() {
    }

    public static int getCode(KeyMapping key) {
        return ((KeyBindingAccessor) key).escpe_screen_getBoundKey().getValue();
    }
}
