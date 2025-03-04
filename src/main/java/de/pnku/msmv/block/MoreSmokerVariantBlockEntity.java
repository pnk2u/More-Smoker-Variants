package de.pnku.msmv.block;

import de.pnku.msmv.init.MsmvBlockInit;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.SmokerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.FuelValues;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class MoreSmokerVariantBlockEntity extends AbstractFurnaceBlockEntity {
    public MoreSmokerVariantBlockEntity(BlockPos pos, BlockState state) {
        super(MsmvBlockInit.MORE_SMOKER_VARIANT_BLOCK_ENTITY, pos, state, RecipeType.SMOKING);
    }

    @Override
    protected @NotNull Component getDefaultName() {
        return Component.translatable("container." + getBlock().smokerWoodType + "_" + getBlock().smokerStoneType + "_smoker");
    }

    @Override
    protected @NotNull AbstractContainerMenu createMenu(int i, Inventory inventory) {
        return new SmokerMenu(i, inventory, this, this.dataAccess);
    }

    protected int getBurnDuration(FuelValues fuelValues, ItemStack fuel) {
        return super.getBurnDuration(fuelValues, fuel) / 2;
    }

    protected MoreSmokerVariantBlock getBlock() {
        return (MoreSmokerVariantBlock) getBlockState().getBlock();
    }
}
