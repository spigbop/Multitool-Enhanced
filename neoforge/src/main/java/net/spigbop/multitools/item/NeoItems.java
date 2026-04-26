package net.spigbop.multitools.item;

import net.minecraft.world.item.Item;

public class NeoItems {
    public static final Item IRON_MULTITOOL =
            new MultitoolItemNeo(ModTiers.STRONG_IRON, new Item.Properties());

    public static final Item GOLDEN_MULTITOOL =
            new MultitoolItemNeo(ModTiers.STRONG_GOLD, new Item.Properties());

    public static final Item DIAMOND_MULTITOOL =
            new MultitoolItemNeo(ModTiers.STRONG_DIAMOND, new Item.Properties());

    public static final Item NETHERITE_MULTITOOL =
            new MultitoolItemNeo(ModTiers.STRONG_NETHERITE, new Item.Properties().fireResistant());
}
