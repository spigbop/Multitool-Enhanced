package net.spigbop.multitool.item;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.spigbop.multitool.Multitool;

public class MultitoolItemTags {
    public static final TagKey<Item> MULTITOOLS = TagKey.of(RegistryKeys.ITEM, new Identifier(Multitool.MOD_ID, "multitools"));
}
