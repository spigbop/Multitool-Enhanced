package net.spigbop.multitool.item;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spigbop.multitool.Multitool;

public class MultitoolItemTags {
    public static final TagKey<Item> MULTITOOLS = TagKey.of(Registry.ITEM_KEY, new Identifier(Multitool.MOD_ID, "multitools"));
}
