package net.spigbop.multitool.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spigbop.multitool.Multitool;
import net.spigbop.multitool.item.custom.MultitoolItem;

public class MultitoolItems {

    // Tools
    public static final Item IRON_MULTITOOL = registerItem("iron_multitool",
            new MultitoolItem(MultitoolToolMaterials.IRON, 1, -2.8f,
                    new FabricItemSettings()));
    public static final Item GOLD_MULTITOOL = registerItem("gold_multitool",
            new MultitoolItem(MultitoolToolMaterials.GOLD, 1, -2.8f,
                    new FabricItemSettings()));
    public static final Item DIAMOND_MULTITOOL = registerItem("diamond_multitool",
            new MultitoolItem(MultitoolToolMaterials.DIAMOND, 1, -2.8f,
                    new FabricItemSettings()));
    public static final Item NETHERITE_MULTITOOL = registerItem("netherite_multitool",
            new MultitoolItem(MultitoolToolMaterials.NETHERITE, 1, -2.8f,
                    new FabricItemSettings().fireproof()));

    // Materials
    public static final Item MULTITOOL_HANDLE = registerItem("multitool_handle",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Multitool.MOD_ID, name), item);
    }

    public static void registerItems() {
        Multitool.LOGGER.info("Registering items for: " + Multitool.MOD_ID);
    }
}
