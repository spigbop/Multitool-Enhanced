package net.spigbop.multitools.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.NotNull;

public class MultitoolItemNeo extends MultitoolItem {

    protected MultitoolItemNeo(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public boolean canPerformAction(@NotNull ItemStack _stack, @NotNull ItemAbility itemAbility) {
        return ItemAbilities.DEFAULT_AXE_ACTIONS.contains(itemAbility) ||
               ItemAbilities.DEFAULT_SHOVEL_ACTIONS.contains(itemAbility) ||
               ItemAbilities.DEFAULT_HOE_ACTIONS.contains(itemAbility);
    }
}
