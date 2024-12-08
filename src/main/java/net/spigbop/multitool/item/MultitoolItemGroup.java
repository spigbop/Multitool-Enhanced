package net.spigbop.multitool.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spigbop.multitool.Multitool;

public class MultitoolItemGroup {
    public static final ItemGroup MULTITOOL = FabricItemGroup.builder()
            .icon(() -> new ItemStack(MultitoolItems.DIAMOND_MULTITOOL))
            .displayName(Text.translatable("itemGroup.multitool.multitools"))
            .entries(((displayContext, entries) -> {
                entries.add(MultitoolItems.IRON_MULTITOOL);
                entries.add(MultitoolItems.GOLD_MULTITOOL);
                entries.add(MultitoolItems.DIAMOND_MULTITOOL);
                entries.add(MultitoolItems.NETHERITE_MULTITOOL);
                entries.add(MultitoolItems.MULTITOOL_HANDLE);
            }))
            .build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Multitool.MOD_ID, "multitools"), MULTITOOL);
    }
}
