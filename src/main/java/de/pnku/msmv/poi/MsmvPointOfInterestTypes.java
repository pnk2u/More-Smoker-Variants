package de.pnku.msmv.poi;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import de.pnku.msmv.init.MsmvBlockInit;
import de.pnku.msmv.mixin.PoiTypesAccessor;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MsmvPointOfInterestTypes {
    public static void init() {
        Map<BlockState, Holder<PoiType>> poiStatesToType = PoiTypesAccessor
                .getPointOfInterestStatesToType();

        Holder<PoiType> butcherEntry = BuiltInRegistries.POINT_OF_INTEREST_TYPE
                .get(PoiTypes.BUTCHER).get();

        PoiType butcherPoiType = BuiltInRegistries.POINT_OF_INTEREST_TYPE.getValue(PoiTypes.BUTCHER);

        List<BlockState> butcherBlockStates = new ArrayList<BlockState>(butcherPoiType.matchingStates);

        for (Block block : MsmvBlockInit.more_smokers) {
            ImmutableList<BlockState> blockStates = block.getStateDefinition().getPossibleStates();

            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, butcherEntry);
            }

            butcherBlockStates.addAll(blockStates);
        }

        butcherPoiType.matchingStates = ImmutableSet.copyOf(butcherBlockStates);
    }
}