package com.godarmor;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item GOD_ARMOR_CORE = register(
            "god_armor_core",
            new Item(new Item.Settings())
    );

    private static Item register(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(GodArmorMod.MOD_ID, name),
                item
        );
    }

    public static void initialize() {
    }
}
