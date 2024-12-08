package net.spigbop.multitool.block;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spigbop.multitool.Multitool;

public class MultitoolBlockTags {
    public static final TagKey<Block> MULTITOOL_BREAKABLE = TagKey.of(Registry.BLOCK_KEY, new Identifier(Multitool.MOD_ID, "multitool_breakable"));
}
