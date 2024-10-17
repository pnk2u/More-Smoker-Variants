package de.pnku.msmv.init;

import de.pnku.msmv.MoreSmokerVariants;
import de.pnku.msmv.block.MoreSmokerVariantBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import static de.pnku.msmv.init.MsmvItemInit.*;
import static de.pnku.msmv.init.MsmvMfvBlockInit.*;

public class MsmvMfvItemInit {
    public static final BlockItem BIRCH_BLACKSTONE_SMOKER_I = itemFromBlock(BIRCH_BLACKSTONE_SMOKER);
    public static final BlockItem OAK_BLACKSTONE_SMOKER_I = itemFromBlock(OAK_BLACKSTONE_SMOKER);
    public static final BlockItem DARK_OAK_BLACKSTONE_SMOKER_I = itemFromBlock(DARK_OAK_BLACKSTONE_SMOKER);
    public static final BlockItem SPRUCE_BLACKSTONE_SMOKER_I = itemFromBlock(SPRUCE_BLACKSTONE_SMOKER);
    public static final BlockItem JUNGLE_BLACKSTONE_SMOKER_I = itemFromBlock(JUNGLE_BLACKSTONE_SMOKER);
    public static final BlockItem ACACIA_BLACKSTONE_SMOKER_I = itemFromBlock(ACACIA_BLACKSTONE_SMOKER);
    public static final BlockItem MANGROVE_BLACKSTONE_SMOKER_I = itemFromBlock(MANGROVE_BLACKSTONE_SMOKER);
    public static final BlockItem CHERRY_BLACKSTONE_SMOKER_I = itemFromBlock(CHERRY_BLACKSTONE_SMOKER);
    public static final BlockItem BAMBOO_BLACKSTONE_SMOKER_I = itemFromBlock(BAMBOO_BLACKSTONE_SMOKER);
    public static final BlockItem CRIMSON_BLACKSTONE_SMOKER_I = itemFromBlock(CRIMSON_BLACKSTONE_SMOKER);
    public static final BlockItem WARPED_BLACKSTONE_SMOKER_I = itemFromBlock(WARPED_BLACKSTONE_SMOKER);
    public static final BlockItem BIRCH_DEEPSLATE_SMOKER_I = itemFromBlock(BIRCH_DEEPSLATE_SMOKER);
    public static final BlockItem OAK_DEEPSLATE_SMOKER_I = itemFromBlock(OAK_DEEPSLATE_SMOKER);
    public static final BlockItem DARK_OAK_DEEPSLATE_SMOKER_I = itemFromBlock(DARK_OAK_DEEPSLATE_SMOKER);
    public static final BlockItem SPRUCE_DEEPSLATE_SMOKER_I = itemFromBlock(SPRUCE_DEEPSLATE_SMOKER);
    public static final BlockItem JUNGLE_DEEPSLATE_SMOKER_I = itemFromBlock(JUNGLE_DEEPSLATE_SMOKER);
    public static final BlockItem ACACIA_DEEPSLATE_SMOKER_I = itemFromBlock(ACACIA_DEEPSLATE_SMOKER);
    public static final BlockItem MANGROVE_DEEPSLATE_SMOKER_I = itemFromBlock(MANGROVE_DEEPSLATE_SMOKER);
    public static final BlockItem CHERRY_DEEPSLATE_SMOKER_I = itemFromBlock(CHERRY_DEEPSLATE_SMOKER);
    public static final BlockItem BAMBOO_DEEPSLATE_SMOKER_I = itemFromBlock(BAMBOO_DEEPSLATE_SMOKER);
    public static final BlockItem CRIMSON_DEEPSLATE_SMOKER_I = itemFromBlock(CRIMSON_DEEPSLATE_SMOKER);
    public static final BlockItem WARPED_DEEPSLATE_SMOKER_I = itemFromBlock(WARPED_DEEPSLATE_SMOKER);

    public static void registerMfvSmokerItems() {
        registerMfvSmokerItem(BIRCH_BLACKSTONE_SMOKER_I, WARPED_COBBLESTONE_SMOKER_I);
        registerMfvSmokerItem(OAK_BLACKSTONE_SMOKER_I, BIRCH_BLACKSTONE_SMOKER_I);
        registerMfvSmokerItem(DARK_OAK_BLACKSTONE_SMOKER_I, OAK_BLACKSTONE_SMOKER_I);
        registerMfvSmokerItem(SPRUCE_BLACKSTONE_SMOKER_I, DARK_OAK_BLACKSTONE_SMOKER_I);
        registerMfvSmokerItem(JUNGLE_BLACKSTONE_SMOKER_I, SPRUCE_BLACKSTONE_SMOKER_I);
        registerMfvSmokerItem(ACACIA_BLACKSTONE_SMOKER_I, JUNGLE_BLACKSTONE_SMOKER_I);
        registerMfvSmokerItem(MANGROVE_BLACKSTONE_SMOKER_I, ACACIA_BLACKSTONE_SMOKER_I);
        registerMfvSmokerItem(CHERRY_BLACKSTONE_SMOKER_I, MANGROVE_BLACKSTONE_SMOKER_I);
        registerMfvSmokerItem(BAMBOO_BLACKSTONE_SMOKER_I, CHERRY_BLACKSTONE_SMOKER_I);
        registerMfvSmokerItem(CRIMSON_BLACKSTONE_SMOKER_I, BAMBOO_BLACKSTONE_SMOKER_I);
        registerMfvSmokerItem(WARPED_BLACKSTONE_SMOKER_I, CRIMSON_BLACKSTONE_SMOKER_I);
        registerMfvSmokerItem(BIRCH_DEEPSLATE_SMOKER_I, WARPED_BLACKSTONE_SMOKER_I);
        registerMfvSmokerItem(OAK_DEEPSLATE_SMOKER_I, BIRCH_DEEPSLATE_SMOKER_I);
        registerMfvSmokerItem(DARK_OAK_DEEPSLATE_SMOKER_I, OAK_DEEPSLATE_SMOKER_I);
        registerMfvSmokerItem(SPRUCE_DEEPSLATE_SMOKER_I, DARK_OAK_DEEPSLATE_SMOKER_I);
        registerMfvSmokerItem(JUNGLE_DEEPSLATE_SMOKER_I, SPRUCE_DEEPSLATE_SMOKER_I);
        registerMfvSmokerItem(ACACIA_DEEPSLATE_SMOKER_I, JUNGLE_DEEPSLATE_SMOKER_I);
        registerMfvSmokerItem(MANGROVE_DEEPSLATE_SMOKER_I, ACACIA_DEEPSLATE_SMOKER_I);
        registerMfvSmokerItem(CHERRY_DEEPSLATE_SMOKER_I, MANGROVE_DEEPSLATE_SMOKER_I);
        registerMfvSmokerItem(BAMBOO_DEEPSLATE_SMOKER_I, CHERRY_DEEPSLATE_SMOKER_I);
        registerMfvSmokerItem(CRIMSON_DEEPSLATE_SMOKER_I, BAMBOO_DEEPSLATE_SMOKER_I);
        registerMfvSmokerItem(WARPED_DEEPSLATE_SMOKER_I, CRIMSON_DEEPSLATE_SMOKER_I);
    }

    private static void registerMfvSmokerItem(BlockItem smoker, Item smokerAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreSmokerVariants.asId(((MoreSmokerVariantBlock) smoker.getBlock()).smokerWoodType + "_" + ((MoreSmokerVariantBlock) smoker.getBlock()).smokerStoneType + "_smoker"), smoker);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(smokerAfter, smoker));
    }
}