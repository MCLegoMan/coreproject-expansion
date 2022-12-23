package com.mclegoman.coreprojectexpansion.common.registry;

/*
 CoreProject: Expansion Pack 1.0.0
 https://github.com/MCLegoMan/coreproject-expansion

 Author: Daniel-Tayden Larsen (MCLegoMan)
 License: MCLM-OSL (2022)

 IMPORTANT:
 This notice must not be removed.
 When modifying this code, you must add a note stating that you modified it.
 */

import com.mclegoman.coreprojectexpansion.common.CoreProjectExpansionStaticData;
import com.mclegoman.coreprojectexpansion.common.features.CoreProjectExpansionBlueberryBushBlock;
import com.mclegoman.coreprojectexpansion.common.gen.CoreProjectExpansionAzureSaplingGenerator;
import com.mclegoman.coreprojectexpansion.common.gen.CoreProjectExpansionCherrySaplingGenerator;
import com.mclegoman.coreprojectexpansion.common.gen.CoreProjectExpansionVioletSaplingGenerator;
import com.mclegoman.coreprojectexpansion.common.gen.CoreProjectExpansionViridescentSaplingGenerator;
import com.mclegoman.legolib.common.LegoLibMethods;
import com.mclegoman.legolib.common.LegoLibStaticData;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Rarity;

import java.util.ArrayList;

public class CoreProjectExpansionItems {
    public static final ArrayList<Block> AzureWoodsetBlocks = LegoLibMethods.registerWoodsetBlocks("azure", CoreProjectExpansionStaticData.ID, new CoreProjectExpansionAzureSaplingGenerator(), FeatureFlags.VANILLA);
    public static final ArrayList<Item> AzureWoodsetItems = LegoLibMethods.registerWoodsetItems("azure", CoreProjectExpansionStaticData.ID, AzureWoodsetBlocks, FeatureFlags.VANILLA);
    public static final Item AZURE_FRUIT = LegoLibMethods.registerItem("azure_fruit", CoreProjectExpansionStaticData.ID, new Item(new FabricItemSettings().food(FoodComponents.APPLE)));
    public static final ArrayList<Block> ViridescentWoodsetBlocks = LegoLibMethods.registerWoodsetBlocks("viridescent", CoreProjectExpansionStaticData.ID, new CoreProjectExpansionViridescentSaplingGenerator(), FeatureFlags.VANILLA);
    public static final ArrayList<Item> ViridescentWoodsetItems = LegoLibMethods.registerWoodsetItems("viridescent", CoreProjectExpansionStaticData.ID, ViridescentWoodsetBlocks, FeatureFlags.VANILLA);
    public static final Item VIRIDESCENT_FRUIT = LegoLibMethods.registerItem("viridescent_fruit", CoreProjectExpansionStaticData.ID, new Item(new FabricItemSettings().food(FoodComponents.APPLE)));
    public static final ArrayList<Block> VioletWoodsetBlocks = LegoLibMethods.registerWoodsetBlocks("violet", CoreProjectExpansionStaticData.ID, new CoreProjectExpansionVioletSaplingGenerator(), FeatureFlags.VANILLA);
    public static final ArrayList<Item> VioletWoodsetItems = LegoLibMethods.registerWoodsetItems("violet", CoreProjectExpansionStaticData.ID, VioletWoodsetBlocks, FeatureFlags.VANILLA);
    public static final Item VIOLET_FRUIT = LegoLibMethods.registerItem("violet_fruit", CoreProjectExpansionStaticData.ID, new Item(new FabricItemSettings().food(FoodComponents.APPLE)));
    public static final ArrayList<Block> CherryWoodsetBlocks = LegoLibMethods.registerWoodsetBlocks("cherry", CoreProjectExpansionStaticData.ID, new CoreProjectExpansionCherrySaplingGenerator(), FeatureFlags.VANILLA);
    public static final ArrayList<Item> CherryWoodsetItems = LegoLibMethods.registerWoodsetItems("cherry", CoreProjectExpansionStaticData.ID, CherryWoodsetBlocks, FeatureFlags.VANILLA);
    public static final Item CHERRY = LegoLibMethods.registerItem("cherry", CoreProjectExpansionStaticData.ID, new Item(new FabricItemSettings().food(FoodComponents.APPLE)));
    public static final Block BLUEBERRY_BUSH = LegoLibMethods.registerBerryBlock("blueberry_bush", CoreProjectExpansionStaticData.ID, "blueberries", new CoreProjectExpansionBlueberryBushBlock(FabricBlockSettings.of(Material.PLANT).ticksRandomly().noCollision().nonOpaque().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));
    public static final Block AZURE_ROSE = LegoLibMethods.registerBlock("azure_rose", CoreProjectExpansionStaticData.ID, new FlowerBlock(StatusEffects.HEALTH_BOOST, 20, FabricBlockSettings.copy(Blocks.POPPY)));
    public static final Block POTTED_AZURE_ROSE = LegoLibMethods.registerBlock("potted_azure_rose", CoreProjectExpansionStaticData.ID, new FlowerPotBlock(AZURE_ROSE, FabricBlockSettings.copy(Blocks.POTTED_POPPY)));
    public static final Block CHERRY_ROSE = LegoLibMethods.registerBlock("cherry_rose", CoreProjectExpansionStaticData.ID, new FlowerBlock(StatusEffects.HEALTH_BOOST, 20, FabricBlockSettings.copy(Blocks.POPPY)));
    public static final Block POTTED_CHERRY_ROSE = LegoLibMethods.registerBlock("potted_cherry_rose", CoreProjectExpansionStaticData.ID, new FlowerPotBlock(CHERRY_ROSE, FabricBlockSettings.copy(Blocks.POTTED_POPPY)));
    public static final Block VIOLET_ROSE = LegoLibMethods.registerBlock("violet_rose", CoreProjectExpansionStaticData.ID, new FlowerBlock(StatusEffects.HEALTH_BOOST, 20, FabricBlockSettings.copy(Blocks.POPPY)));
    public static final Block POTTED_VIOLET_ROSE = LegoLibMethods.registerBlock("potted_violet_rose", CoreProjectExpansionStaticData.ID, new FlowerPotBlock(VIOLET_ROSE, FabricBlockSettings.copy(Blocks.POTTED_POPPY)));
    public static final Block VIRIDESCENT_ROSE = LegoLibMethods.registerBlock("viridescent_rose", CoreProjectExpansionStaticData.ID, new FlowerBlock(StatusEffects.HEALTH_BOOST, 20, FabricBlockSettings.copy(Blocks.POPPY)));
    public static final Block POTTED_VIRIDESCENT_ROSE = LegoLibMethods.registerBlock("potted_viridescent_rose", CoreProjectExpansionStaticData.ID, new FlowerPotBlock(VIRIDESCENT_ROSE, FabricBlockSettings.copy(Blocks.POTTED_POPPY)));
    public static final Block VIBRANT_GRASS = LegoLibMethods.registerBlock("vibrant_grass", CoreProjectExpansionStaticData.ID, new FernBlock(AbstractBlock.Settings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offsetType(AbstractBlock.OffsetType.XYZ)));
    public static final Item MCLEGOMAN = LegoLibMethods.registerWearableItem("mclegoman", CoreProjectExpansionStaticData.ID);
    public static final Item MCLEGOGOAT = LegoLibMethods.registerWearableItem("mclegogoat", CoreProjectExpansionStaticData.ID);
    public static final Block DARKSUNSHYNE = LegoLibMethods.registerWearableBlock("darksunshyne", CoreProjectExpansionStaticData.ID);
    public static final Item DUCKSYY_ = LegoLibMethods.registerWearableItem("ducksyy_", CoreProjectExpansionStaticData.ID);
    public static final Item XXFOXYTUBEXX = LegoLibMethods.registerWearableItem("xxfoxytubexx", CoreProjectExpansionStaticData.ID);
    public static final Item LEWIS_PLAYS = LegoLibMethods.registerWearableItem("lewis_plays", CoreProjectExpansionStaticData.ID);
    public static final Item MAJIKZ = LegoLibMethods.registerWearableItem("majikz", CoreProjectExpansionStaticData.ID);
    public static final Item ROGOOEY = LegoLibMethods.registerWearableItem("rogooey", CoreProjectExpansionStaticData.ID);
    public static final Block X052805X = LegoLibMethods.registerWearableBlock("x052805x", CoreProjectExpansionStaticData.ID);
    public static final Block RACHELRABBIT54 = LegoLibMethods.registerWearableBlock("rachelrabbit54", CoreProjectExpansionStaticData.ID);
    public static final Item DER_WAFFELMAN = LegoLibMethods.registerWearableItem("der_waffelman", CoreProjectExpansionStaticData.ID);
    public static final Item ZOMBIEGIRL_MC = LegoLibMethods.registerWearableItem("zombiegirl_mc", CoreProjectExpansionStaticData.ID);
    public static final Item MUSTACHE = LegoLibMethods.registerWearableItem("mustache", CoreProjectExpansionStaticData.ID);
    public static final Block BIN = LegoLibMethods.registerWearableBlock("bin", CoreProjectExpansionStaticData.ID);
    public static final Item REPORTER = LegoLibMethods.registerWearableItem("reporter", CoreProjectExpansionStaticData.ID);
    public static final Item STRAW_HAT = LegoLibMethods.registerWearableItem("straw_hat", CoreProjectExpansionStaticData.ID);
    public static final Item CAT_EARS = LegoLibMethods.registerWearableItem("cat_ears", CoreProjectExpansionStaticData.ID);
    public static final Item FIRE_TOTEM = LegoLibMethods.registerItem("fire_totem", CoreProjectExpansionStaticData.ID, new Item(new FabricItemSettings().maxCount(1)));
    public static final Item WATER_TOTEM = LegoLibMethods.registerItem("water_totem", CoreProjectExpansionStaticData.ID, new Item(new FabricItemSettings().maxCount(1)));

    public static void register() {
        LegoLibStaticData.sendMessageToLog(CoreProjectExpansionStaticData.PREFIX, "registering", "Blocks and Items");
    }
}