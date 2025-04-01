package net.spigbop.multitools.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.spigbop.multitools.Constants;
import net.spigbop.multitools.config.ForgeConfig;
import net.spigbop.multitools.item.*;

import static net.spigbop.multitools.util.AutoRegistry.getObjectsFrom;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForgeRegistry {

    private static boolean configLoaded = false;

    @SubscribeEvent
    public static void registerAll(RegisterEvent event) {

        event.register(ForgeRegistries.Keys.ITEMS, helper -> {
            getObjectsFrom(ForgeItems.class, Item.class).forEach((item, name) -> {
                helper.register(new ResourceLocation(Constants.MOD_ID, name), item);
            });
        });

        event.register(ForgeRegistries.Keys.ITEMS, helper -> {
            getObjectsFrom(ModItems.class, Item.class).forEach((item, name) -> {
                helper.register(new ResourceLocation(Constants.MOD_ID, name), item);
            });
        });

        event.register(BuiltInRegistries.CREATIVE_MODE_TAB.key(), helper -> {
            getObjectsFrom(ModItemGroups.class, CreativeModeTab.class).forEach((tab, name) -> {
                helper.register(new ResourceLocation(Constants.MOD_ID, name), tab);
            });
        });
    }
}
