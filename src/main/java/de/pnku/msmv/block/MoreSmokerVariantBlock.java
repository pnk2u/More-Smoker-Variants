package de.pnku.msmv.block;

import de.pnku.msmv.MoreSmokerVariants;
import de.pnku.msmv.init.MsmvBlockInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.stats.Stats;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SmokerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MoreSmokerVariantBlock extends SmokerBlock {
    public final String smokerWoodType;
    public final String smokerStoneType;

    public MoreSmokerVariantBlock(MapColor colour, String smokerWoodType, String smokerStoneType) {
        super(Properties.ofFullCopy(Blocks.SMOKER).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreSmokerVariants.asId(smokerWoodType + "_" + smokerStoneType + "_smoker"))));
        this.smokerWoodType = smokerWoodType;
        this.smokerStoneType = smokerStoneType;
    }

    public MoreSmokerVariantBlock(MapColor colour, SoundType sound, String smokerWoodType, String smokerStoneType) {
        super(Properties.ofFullCopy(Blocks.SMOKER).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreSmokerVariants.asId(smokerWoodType + "_" + smokerStoneType + "_smoker"))).sound(sound));
        this.smokerWoodType = smokerWoodType;
        this.smokerStoneType = smokerStoneType;
    }
    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
            return createFurnaceTicker(level, type, MsmvBlockInit.MORE_SMOKER_VARIANT_BLOCK_ENTITY);
    }

    @Override
    protected void openContainer(Level level, BlockPos pos, Player player) {
        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (blockEntity instanceof MoreSmokerVariantBlockEntity) {
            player.openMenu((MenuProvider) blockEntity);
            player.awardStat(Stats.INTERACT_WITH_SMOKER);
        }
    }

    @Override
    public @NotNull BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
            return new MoreSmokerVariantBlockEntity(pos, state);
    }
}