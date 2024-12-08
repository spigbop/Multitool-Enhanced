package net.spigbop.multitool.block;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.spigbop.multitool.Multitool;

public class MultitoolBlockTags {
    public static final TagKey<Block> MULTITOOL_BREAKABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(Multitool.MOD_ID, "multitool_breakable"));
}
