package net.spigbop.multitools.block;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.spigbop.multitools.Constants;

public class ModBlockTags {
    public static final TagKey<Block> MULTITOOL_BREAKABLE = TagKey.create(BuiltInRegistries.BLOCK.key(), new ResourceLocation(Constants.MOD_ID, "multitool_breakable"));
}
