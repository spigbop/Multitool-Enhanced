package net.spigbop.multitools.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class MultitoolItemForge extends MultitoolItem {
    public MultitoolItemForge(float attackDamageModifier, float attackSpeedModifier, Tier tier, Properties properties) {
        super(attackDamageModifier, attackSpeedModifier, tier, properties);
    }

    @Override
    public boolean canPerformAction(ItemStack stack, ToolAction toolAction) {
        return ToolActions.DEFAULT_AXE_ACTIONS.contains(toolAction) ||
               ToolActions.DEFAULT_SHOVEL_ACTIONS.contains(toolAction) ||
               ToolActions.DEFAULT_HOE_ACTIONS.contains(toolAction);
    }
}
