package net.spigbop.multitools;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.spigbop.multitools.config.FabricConfig;
import net.spigbop.multitools.registry.FabricRegistry;

public class Multitools implements ModInitializer {

    public static FabricConfig config;

    @Override
    public void onInitialize() {
        AutoConfig.register(FabricConfig.class, Toml4jConfigSerializer::new);
        config = AutoConfig.getConfigHolder(FabricConfig.class).getConfig();

        FabricRegistry.register();
    }
}
