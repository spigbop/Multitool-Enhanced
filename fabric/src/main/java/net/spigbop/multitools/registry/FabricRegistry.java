package net.spigbop.multitools.registry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.spigbop.multitools.Constants;
import net.spigbop.multitools.item.FabricItems;
import net.spigbop.multitools.item.ModItemGroups;
import net.spigbop.multitools.item.ModItems;

import static net.spigbop.multitools.util.AutoRegistry.getObjectsFrom;

public class FabricRegistry {
    public static void register() {

        // Register Fabric Items
        getObjectsFrom(FabricItems.class, Item.class).forEach((item, name) -> {
            Registry.register(BuiltInRegistries.ITEM,
                    ResourceKey.create(BuiltInRegistries.ITEM.key(), new ResourceLocation(Constants.MOD_ID, name)),
                    item);
        });

        // Register Items
        getObjectsFrom(ModItems.class, Item.class).forEach((item, name) -> {
            Registry.register(BuiltInRegistries.ITEM,
                    ResourceKey.create(BuiltInRegistries.ITEM.key(), new ResourceLocation(Constants.MOD_ID, name)),
                    item);
        });

        // Register Tabs
        getObjectsFrom(ModItemGroups.class, CreativeModeTab.class).forEach((tab, name) -> {
            Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                    ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), new ResourceLocation(Constants.MOD_ID, name)),
                    tab);
        });
    }
}
