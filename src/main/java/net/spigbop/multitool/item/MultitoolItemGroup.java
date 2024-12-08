package net.spigbop.multitool.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.spigbop.multitool.Multitool;

public class MultitoolItemGroup {
    public static final ItemGroup MULTITOOL = FabricItemGroup.builder(new Identifier(Multitool.MOD_ID, "multitools"))
            .icon(() -> new ItemStack(MultitoolItems.DIAMOND_MULTITOOL))
            .build();

    public static void registerItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(MULTITOOL).register(content -> {
            content.add(MultitoolItems.IRON_MULTITOOL);
            content.add(MultitoolItems.GOLD_MULTITOOL);
            content.add(MultitoolItems.DIAMOND_MULTITOOL);
            content.add(MultitoolItems.NETHERITE_MULTITOOL);
            content.add(MultitoolItems.MULTITOOL_HANDLE);
        });
    }
}
