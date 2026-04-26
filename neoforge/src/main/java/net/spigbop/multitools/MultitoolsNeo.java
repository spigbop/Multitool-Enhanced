package net.spigbop.multitools;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.spigbop.multitools.registry.NeoRegistry;

@Mod(Constants.MOD_ID)
public class MultitoolsNeo {

    public MultitoolsNeo(IEventBus eventBus) {
        eventBus.register(NeoRegistry.class);
    }
}