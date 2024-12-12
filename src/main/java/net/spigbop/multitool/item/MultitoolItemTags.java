package net.spigbop.multitool.item;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.spigbop.multitool.Multitool;

public final class MultitoolItemTags {
    public static final TagKey<Item> MULTITOOLS = TagKey.of(RegistryKeys.ITEM, Identifier.of(Multitool.MOD_ID, "multitools"));
}
