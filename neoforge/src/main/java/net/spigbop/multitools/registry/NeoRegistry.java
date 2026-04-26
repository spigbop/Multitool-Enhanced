package net.spigbop.multitools.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.RegisterEvent;
import net.spigbop.multitools.Constants;
import net.spigbop.multitools.item.ModItemGroups;
import net.spigbop.multitools.item.ModItems;
import net.spigbop.multitools.item.NeoItems;

import static net.spigbop.multitools.util.AutoRegistry.getObjectsFrom;

public class NeoRegistry {
    @SubscribeEvent
    public static void register(RegisterEvent event) {

        // Register Items
        event.register(BuiltInRegistries.ITEM.key(), helper -> {
            getObjectsFrom(ModItems.class, Item.class).forEach((item, name) -> {
                helper.register(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), item);
            });
        });

        // Register Neo-specific items
        event.register(BuiltInRegistries.ITEM.key(), helper -> {
            getObjectsFrom(NeoItems.class, Item.class).forEach((item, name) -> {
                helper.register(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), item);
            });
        });

        // Register Tabs
        event.register(BuiltInRegistries.CREATIVE_MODE_TAB.key(), helper -> {
            getObjectsFrom(ModItemGroups.class, CreativeModeTab.class).forEach((tab, name) -> {
                helper.register(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), tab);
            });
        });
    }
}
