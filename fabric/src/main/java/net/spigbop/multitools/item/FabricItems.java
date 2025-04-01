package net.spigbop.multitools.item;

import net.minecraft.world.item.Item;

public class FabricItems {
    public static final Item IRON_MULTITOOL =
            new MultitoolItem(5.0F, -3.0F, ModTiers.STRONG_IRON, new Item.Properties());

    public static final Item GOLDEN_MULTITOOL =
            new MultitoolItem(5.0F, -3.0F, ModTiers.STRONG_GOLD, new Item.Properties());

    public static final Item DIAMOND_MULTITOOL =
            new MultitoolItem(5.0F, -3.0F, ModTiers.STRONG_DIAMOND, new Item.Properties());

    public static final Item NETHERITE_MULTITOOL =
            new MultitoolItem(5.0F, -3.0F, ModTiers.STRONG_NETHERITE, new Item.Properties().fireResistant());
}
