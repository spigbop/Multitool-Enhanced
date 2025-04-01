package net.spigbop.multitools;

import net.minecraftforge.fml.common.Mod;
import net.spigbop.multitools.config.ForgeConfig;

@Mod(net.spigbop.multitools.Constants.MOD_ID)
public class MultitoolsForge {

    public MultitoolsForge() {
        ForgeConfig.register();
    }
}