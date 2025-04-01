package net.spigbop.multitools.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.spigbop.multitools.Constants;

public class ModItemGroups {
    public static final CreativeModeTab MULTITOOLS_ENHANCED = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 4)
            .title(Component.translatable("itemGroup.multitools.multitools_enhanced"))
            .icon(() -> new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation(Constants.MOD_ID, "diamond_multitool"))))
            .displayItems((params, output) -> {
                output.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(Constants.MOD_ID, "iron_multitool")));
                output.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(Constants.MOD_ID, "golden_multitool")));
                output.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(Constants.MOD_ID, "diamond_multitool")));
                output.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(Constants.MOD_ID, "netherite_multitool")));
                output.accept(ModItems.MULTITOOL_HANDLE);
                output.accept(ModItems.MULTITOOL_NETHERITE_UPGRADE);
            })
            .build();
}
