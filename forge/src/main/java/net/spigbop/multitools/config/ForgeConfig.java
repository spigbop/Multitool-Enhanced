package net.spigbop.multitools.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class ForgeConfig {
    public static final ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.IntValue ironMultitoolDurability;
    public static ForgeConfigSpec.IntValue diamondMultitoolDurability;
    public static ForgeConfigSpec.IntValue goldenMultitoolDurability;
    public static ForgeConfigSpec.IntValue netheriteMultitoolDurability;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("Durability Settings").push("durability");

        ironMultitoolDurability = builder.defineInRange("iron_multitool_durability", 500, 0, Integer.MAX_VALUE);
        diamondMultitoolDurability = builder.defineInRange("diamond_multitool_durability", 3122, 0, Integer.MAX_VALUE);
        goldenMultitoolDurability = builder.defineInRange("golden_multitool_durability", 64, 0, Integer.MAX_VALUE);
        netheriteMultitoolDurability = builder.defineInRange("netherite_multitool_durability", 4032, 0, Integer.MAX_VALUE);

        builder.pop();

        SPEC = builder.build();
    }

    public static void register() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ForgeConfig.SPEC, "multitools.toml");
    }
}
