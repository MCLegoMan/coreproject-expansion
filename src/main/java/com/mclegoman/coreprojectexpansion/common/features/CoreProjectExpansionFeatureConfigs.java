package com.mclegoman.coreprojectexpansion.common.features;

/*
 CoreProject: Expansion Pack 1.0.0
 https://github.com/MCLegoMan/coreproject-expansion

 Author: Daniel-Tayden Larsen (MCLegoMan)
 License: MCLM-OSL (2022)

 IMPORTANT:
 This notice must not be removed.
 When modifying this code, you must add a note stating that you modified it.
 */

import com.mclegoman.coreprojectexpansion.common.registry.CoreProjectExpansionItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BushFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class CoreProjectExpansionFeatureConfigs {
    public static final TreeFeatureConfig AZURE_TREE_CONFIG = azure(CoreProjectExpansionItems.AzureWoodsetBlocks.get(0), CoreProjectExpansionItems.AzureWoodsetBlocks.get(13), 1);
    public static final RandomPatchFeatureConfig AZURE_ROSE_FLOWER_CONFIG = ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(CoreProjectExpansionItems.AZURE_ROSE)), List.of(), 1);
    public static final TreeFeatureConfig VIRIDESCENT_TREE_CONFIG = viridescent(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(0), CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(13), 3);
    public static final RandomPatchFeatureConfig VIRIDESCENT_ROSE_FLOWER_CONFIG = ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(CoreProjectExpansionItems.VIRIDESCENT_ROSE)), List.of(), 1);
    public static final TreeFeatureConfig VIOLET_TREE_CONFIG = violet(CoreProjectExpansionItems.VioletWoodsetBlocks.get(0), CoreProjectExpansionItems.VioletWoodsetBlocks.get(13), 2);
    public static final RandomPatchFeatureConfig VIOLET_ROSE_FLOWER_CONFIG = ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(CoreProjectExpansionItems.VIOLET_ROSE)), List.of(), 1);
    public static final TreeFeatureConfig CHERRY_TREE_CONFIG = cherry(CoreProjectExpansionItems.CherryWoodsetBlocks.get(0), CoreProjectExpansionItems.CherryWoodsetBlocks.get(13), 4);
    public static final RandomPatchFeatureConfig CHERRY_ROSE_FLOWER_CONFIG = ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(CoreProjectExpansionItems.CHERRY_ROSE)), List.of(), 1);
    public static final RandomPatchFeatureConfig BLUEBERRY_BUSH_CONFIG = ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(CoreProjectExpansionItems.BLUEBERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3))), List.of(), 2);
    public static final RandomPatchFeatureConfig VIBRANT_GRASS_CONFIG = ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(CoreProjectExpansionItems.VIBRANT_GRASS)), List.of(), 8);
    private static TreeFeatureConfig azure(Block trunk, Block leaves, int height) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(trunk.getDefaultState()),
                new StraightTrunkPlacer(height, 1, 0),
                BlockStateProvider.of(leaves.getDefaultState()),
                new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
                new TwoLayersFeatureSize(1, 0, 1)
        ).ignoreVines().build();
    }
    private static TreeFeatureConfig viridescent(Block trunk, Block leaves, int height) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(trunk.getDefaultState()),
                new StraightTrunkPlacer(height, 3, 0),
                BlockStateProvider.of(leaves.getDefaultState()),
                new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
                new TwoLayersFeatureSize(1, 0, 1)
        ).ignoreVines().build();
    }
    private static TreeFeatureConfig violet(Block trunk, Block leaves, int height) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(trunk.getDefaultState()),
                new StraightTrunkPlacer(height, 2, 0),
                BlockStateProvider.of(leaves.getDefaultState()),
                new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
                new TwoLayersFeatureSize(1, 0, 1)
        ).ignoreVines().build();
    }
    private static TreeFeatureConfig cherry(Block trunk, Block leaves, int height) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(trunk.getDefaultState()),
                new StraightTrunkPlacer(height, 2, 0),
                BlockStateProvider.of(leaves.getDefaultState()),
                new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
                new TwoLayersFeatureSize(1, 0, 1)
        ).ignoreVines().build();
    }

    private static DataPool.Builder<BlockState> createStatePoolBuilder() {
        return DataPool.builder();
    }
}