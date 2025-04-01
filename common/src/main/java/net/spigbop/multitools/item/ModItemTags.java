package net.spigbop.multitools.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.spigbop.multitools.Constants;

public class ModItemTags {
    public static final TagKey<Item> MULTITOOLS = TagKey.create(BuiltInRegistries.ITEM.key(), new ResourceLocation(Constants.COMMON_ID, "multitools"));
}
