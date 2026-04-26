package net.spigbop.multitools.item;

import com.google.common.base.Suppliers;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.spigbop.multitools.config.ConfigProvider;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Supplier;

public enum ModTiers implements Tier {
    STRONG_IRON(BlockTags.INCORRECT_FOR_IRON_TOOL, () -> ConfigProvider.request("ironMultitoolDurability", 500), 6.0F, 2.0F, 14, () -> Ingredient.of(Items.IRON_INGOT)),
    STRONG_DIAMOND(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, () -> ConfigProvider.request("diamondMultitoolDurability", 3122), 8.0F, 3.0F, 10, () -> Ingredient.of(new ItemLike[]{Items.DIAMOND})),
    STRONG_GOLD(BlockTags.INCORRECT_FOR_GOLD_TOOL, () -> ConfigProvider.request("goldenMultitoolDurability", 64), 12.0F, 0.0F, 22, () -> Ingredient.of(new ItemLike[]{Items.GOLD_INGOT})),
    STRONG_NETHERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, () -> ConfigProvider.request("netheriteMultitoolDurability", 4032), 9.0F, 4.0F, 15, () -> Ingredient.of(new ItemLike[]{Items.NETHERITE_INGOT}));

    private final TagKey<Block> incorrectBlocksForDrops;
    private final Supplier<Integer> uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    private ModTiers(TagKey<Block> incorrectBlockForDrops, Supplier<Integer> uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.incorrectBlocksForDrops = incorrectBlockForDrops;
        this.uses = Suppliers.memoize(uses::get);
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        Objects.requireNonNull(repairIngredient);
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
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

    @Override
    public @NotNull TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public @NotNull Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
