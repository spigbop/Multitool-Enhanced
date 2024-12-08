package net.spigbop.multitool.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum MultitoolToolMaterials implements ToolMaterial {
    IRON(2, 500, 6.0F, 2.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }),
    DIAMOND(3, 3122, 8.0F, 3.0F, 10, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
    }),
    GOLD(0, 64, 12.0F, 0.0F, 22, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
    }),
    NETHERITE(4, 4062, 9.0F, 4.0F, 15, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private MultitoolToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}