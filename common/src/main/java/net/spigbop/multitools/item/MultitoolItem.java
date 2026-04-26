package net.spigbop.multitools.item;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.spigbop.multitools.block.ModBlockTags;
import org.jetbrains.annotations.NotNull;

public class MultitoolItem extends DiggerItem {

    protected MultitoolItem(Tier tier, Properties properties) {
        super(tier, ModBlockTags.MULTITOOL_BREAKABLE, properties);
    }

    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext context) {
        InteractionResult axeResult = Items.DIAMOND_AXE.useOn(context);
        if(axeResult.equals(InteractionResult.PASS)) {
            Player player = context.getPlayer();
            if(player != null && player.isCrouching()) {
                return Items.DIAMOND_HOE.useOn(context);
            } else {
                return Items.DIAMOND_SHOVEL.useOn(context);
            }
        }

        return axeResult;
    }
}
