package net.spigbop.multitool.config;

import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.RestartRequired;
import io.wispforest.owo.config.annotation.Sync;
import net.spigbop.multitool.Multitool;

@Modmenu(modId = Multitool.MOD_ID)
@Config(name = "multitool-config", wrapperName = "MultitoolConfig")
public class MultitoolConfigModel {
    @RestartRequired
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public int ironMultitoolDurability = 500;
    @RestartRequired
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public int diamondMultitoolDurability = 3122;
    @RestartRequired
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public int goldMultitoolDurability = 64;
    @RestartRequired
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public int netheriteMultitoolDurability = 4062;
}
