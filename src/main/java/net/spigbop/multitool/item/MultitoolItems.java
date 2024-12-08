package net.spigbop.multitool.item;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.spigbop.multitool.Multitool;
import net.spigbop.multitool.item.custom.MultitoolItem;

import java.util.function.Function;

public class MultitoolItems {

    // Tools
    public static final Item IRON_MULTITOOL = register("iron_multitool", (settings) -> {
        return new MultitoolItem(MultitoolToolMaterials.IRON, 1.0F, -2.8F, settings);
    });
    public static final Item GOLDEN_MULTITOOL = register("golden_multitool", (settings) -> {
        return new MultitoolItem(MultitoolToolMaterials.IRON, 1.0F, -2.8F, settings);
    });
    public static final Item DIAMOND_MULTITOOL = register("diamond_multitool", (settings) -> {
        return new MultitoolItem(MultitoolToolMaterials.IRON, 1.0F, -2.8F, settings);
    });
    public static final Item NETHERITE_MULTITOOL = register("netherite_multitool", (settings) -> {
        return new MultitoolItem(MultitoolToolMaterials.IRON, 1.0F, -2.8F, settings);
    }, (new Item.Settings()).fireproof());

    // Materials
    public static final Item MULTITOOL_HANDLE = register("multitool_handle");


    private static RegistryKey<Item> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Multitool.MOD_ID, id));
    }

    public static Item register(String id) {
        return Items.register(keyOf(id), Item::new, new Item.Settings());
    }

    public static Item register(String id, Function<Item.Settings, Item> factory) {
        return Items.register(keyOf(id), factory, new Item.Settings());
    }

    public static Item register(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        return Items.register(keyOf(id), factory, settings);
    }

    public static void registerItems() {
        Multitool.LOGGER.info("Registering items for: " + Multitool.MOD_ID);
    }
}