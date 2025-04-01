package net.spigbop.multitools.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import net.spigbop.multitools.Constants;

@Config(name = Constants.MOD_ID)
public class FabricConfig implements ConfigData {
    public int ironMultitoolDurability = 500;
    public int diamondMultitoolDurability = 3122;
    public int goldenMultitoolDurability = 64;
    public int netheriteMultitoolDurability = 4032;
}
