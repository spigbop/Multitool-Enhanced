package net.spigbop.multitool.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spigbop.multitool.Multitool;
import net.spigbop.multitool.item.custom.MultitoolItem;

public class MultitoolItems {

    // Tools
    public static final Item IRON_MULTITOOL = registerItem("iron_multitool",
            new MultitoolItem(MultitoolToolMaterials.IRON, 1F, -2.8F,
                    new FabricItemSettings().group(MultitoolItemGroup.MULTITOOL)));
    public static final Item GOLDEN_MULTITOOL = registerItem("golden_multitool",
            new MultitoolItem(MultitoolToolMaterials.GOLD, 1F, -2.8F,
                    new FabricItemSettings().group(MultitoolItemGroup.MULTITOOL)));
    public static final Item DIAMOND_MULTITOOL = registerItem("diamond_multitool",
            new MultitoolItem(MultitoolToolMaterials.DIAMOND, 1F, -2.8F,
                    new FabricItemSettings().group(MultitoolItemGroup.MULTITOOL)));
    public static final Item NETHERITE_MULTITOOL = registerItem("netherite_multitool",
            new MultitoolItem(MultitoolToolMaterials.NETHERITE, 1F, -2.8F,
                    new FabricItemSettings().group(MultitoolItemGroup.MULTITOOL).fireproof()));

    // Materials
    public static final Item MULTITOOL_HANDLE = registerItem("multitool_handle",
            new Item(new FabricItemSettings().group(MultitoolItemGroup.MULTITOOL)));
    public static final Item MULTITOOL_NETHERITE_UPGRADE = registerItem("multitool_netherite_upgrade",
            new Item(new FabricItemSettings().group(MultitoolItemGroup.MULTITOOL)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Multitool.MOD_ID, name), item);
    }

    public static void registerItems() {
        Multitool.LOGGER.info("Registering items for: " + Multitool.MOD_ID);
    }
}
