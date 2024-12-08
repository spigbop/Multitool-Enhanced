package net.spigbop.multitool.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.spigbop.multitool.Multitool;

public class MultitoolItemGroup {
    public static final ItemGroup MULTITOOL = FabricItemGroupBuilder.build(new Identifier(Multitool.MOD_ID, "multitools"), () -> new ItemStack(MultitoolItems.DIAMOND_MULTITOOL));
}
