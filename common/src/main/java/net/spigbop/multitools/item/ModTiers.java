package net.spigbop.multitools.item;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.spigbop.multitools.config.ConfigProvider;

import java.util.function.Supplier;

@SuppressWarnings("deprecation")
public enum ModTiers implements Tier {
    STRONG_IRON(2, () -> ConfigProvider.request("ironMultitoolDurability", 500), 6.0F, 2.0F, 14, () -> Ingredient.of(Items.IRON_INGOT)),
    STRONG_DIAMOND(3, () -> ConfigProvider.request("diamondMultitoolDurability", 3122), 8.0F, 3.0F, 10, () -> Ingredient.of(new ItemLike[]{Items.DIAMOND})),
    STRONG_GOLD(0, () -> ConfigProvider.request("goldenMultitoolDurability", 64), 12.0F, 0.0F, 22, () -> Ingredient.of(new ItemLike[]{Items.GOLD_INGOT})),
    STRONG_NETHERITE(4, () -> ConfigProvider.request("netheriteMultitoolDurability", 4032), 9.0F, 4.0F, 15, () -> Ingredient.of(new ItemLike[]{Items.NETHERITE_INGOT}));

    private final int level;
    private final LazyLoadedValue<Integer> uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModTiers(int level, Supplier uses, float speed, float damage, int enchantmentValue, Supplier repairIngredient) {
        this.level = level;
        this.uses = new LazyLoadedValue(uses);
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyLoadedValue(repairIngredient);
    }

    public int getUses() {
        return this.uses.get();
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
