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

import com.mclegoman.coreprojectexpansion.common.CoreProjectExpansionStaticData;
import com.mclegoman.legolib.common.LegoLibStaticData;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("UnstableApiUsage")
public class CoreProjectExpansionPlacedFeatures {
    private static final RegistryKey<PlacedFeature> AZURE_TREE = createRegistryKey("azure_tree");
    private static final RegistryKey<ConfiguredFeature<?, ?>> AZURE_TREES_CONFIGURED = CoreProjectExpansionConfiguredFeatures.createRegistryKey("azure_trees");
    public static final RegistryKey<PlacedFeature> AZURE_TREES = createRegistryKey("azure_trees");
    public static final RegistryKey<PlacedFeature> AZURE_ROSE_FLOWER = createRegistryKey("azure_rose_flower");
    private static final RegistryKey<PlacedFeature> VIRIDESCENT_TREE = createRegistryKey("viridescent_tree");
    private static final RegistryKey<ConfiguredFeature<?, ?>> VIRIDESCENT_TREES_CONFIGURED = CoreProjectExpansionConfiguredFeatures.createRegistryKey("viridescent_trees");
    public static final RegistryKey<PlacedFeature> VIRIDESCENT_TREES = createRegistryKey("viridescent_trees");
    public static final RegistryKey<PlacedFeature> VIRIDESCENT_ROSE_FLOWER = createRegistryKey("viridescent_rose_flower");
    private static final RegistryKey<PlacedFeature> VIOLET_TREE = createRegistryKey("violet_tree");
    private static final RegistryKey<ConfiguredFeature<?, ?>> VIOLET_TREES_CONFIGURED = CoreProjectExpansionConfiguredFeatures.createRegistryKey("violet_trees");
    public static final RegistryKey<PlacedFeature> VIOLET_TREES = createRegistryKey("violet_trees");
    public static final RegistryKey<PlacedFeature> VIOLET_ROSE_FLOWER = createRegistryKey("violet_rose_flower");
    private static final RegistryKey<PlacedFeature> CHERRY_TREE = createRegistryKey("cherry_tree");
    private static final RegistryKey<ConfiguredFeature<?, ?>> CHERRY_TREES_CONFIGURED = CoreProjectExpansionConfiguredFeatures.createRegistryKey("cherry_trees");
    public static final RegistryKey<PlacedFeature> CHERRY_TREES = createRegistryKey("cherry_trees");
    public static final RegistryKey<PlacedFeature> CHERRY_ROSE_FLOWER = createRegistryKey("cherry_rose_flower");
    private static final RegistryKey<ConfiguredFeature<?, ?>> CORE_TREES_CONFIGURED = CoreProjectExpansionConfiguredFeatures.createRegistryKey("core_trees");
    public static final RegistryKey<PlacedFeature> CORE_TREES = createRegistryKey("core_trees");
    public static final RegistryKey<PlacedFeature> BLUEBERRY_BUSH = createRegistryKey("blueberry_bush");
    public static final RegistryKey<PlacedFeature> VIBRANT_GRASS = createRegistryKey("vibrant_grass");
    public static void populate(FabricDynamicRegistryProvider.Entries entries) {
        entries.add(AZURE_TREE, placeFeatureWithoutBiomeFilter(entries, CoreProjectExpansionConfiguredFeatures.AZURE_TREE));
        entries.add(VIRIDESCENT_TREE, placeFeatureWithoutBiomeFilter(entries, CoreProjectExpansionConfiguredFeatures.VIRIDESCENT_TREE));
        entries.add(VIOLET_TREE, placeFeatureWithoutBiomeFilter(entries, CoreProjectExpansionConfiguredFeatures.VIOLET_TREE));
        entries.add(CHERRY_TREE, placeFeatureWithoutBiomeFilter(entries, CoreProjectExpansionConfiguredFeatures.CHERRY_TREE));
        entries.add(AZURE_TREES_CONFIGURED, CoreProjectExpansionConfiguredFeatures.configureFeature(
                Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfig(
                        RegistryEntryList.of(
                                entries.ref(AZURE_TREE)
                        )
                )
        ));
        entries.add(VIRIDESCENT_TREES_CONFIGURED, CoreProjectExpansionConfiguredFeatures.configureFeature(
                Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfig(
                        RegistryEntryList.of(
                                entries.ref(VIRIDESCENT_TREE)
                        )
                )
        ));
        entries.add(VIOLET_TREES_CONFIGURED, CoreProjectExpansionConfiguredFeatures.configureFeature(
                Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfig(
                        RegistryEntryList.of(
                                entries.ref(VIOLET_TREE)
                        )
                )
        ));
        entries.add(CHERRY_TREES_CONFIGURED, CoreProjectExpansionConfiguredFeatures.configureFeature(
                Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfig(
                        RegistryEntryList.of(
                                entries.ref(CHERRY_TREE)
                        )
                )
        ));
        entries.add(CORE_TREES_CONFIGURED, CoreProjectExpansionConfiguredFeatures.configureFeature(
                Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfig(
                        RegistryEntryList.of(
                                entries.ref(AZURE_TREE),
                                entries.ref(VIRIDESCENT_TREE),
                                entries.ref(VIOLET_TREE),
                                entries.ref(CHERRY_TREE)
                        )
                )
        ));
        entries.add(AZURE_TREES, placeFeature(entries, AZURE_TREES_CONFIGURED, PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BlockFilterPlacementModifier.of(BlockPredicate.matchingBlockTag(Direction.DOWN.getVector(), BlockTags.DIRT))));
        entries.add(AZURE_ROSE_FLOWER, placeFeature(entries, CoreProjectExpansionConfiguredFeatures.AZURE_ROSE_FLOWER, VegetationPlacedFeatures.modifiers(4)));
        entries.add(VIRIDESCENT_TREES, placeFeature(entries, VIRIDESCENT_TREES_CONFIGURED, PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BlockFilterPlacementModifier.of(BlockPredicate.matchingBlockTag(Direction.DOWN.getVector(), BlockTags.DIRT))));
        entries.add(VIRIDESCENT_ROSE_FLOWER, placeFeature(entries, CoreProjectExpansionConfiguredFeatures.VIRIDESCENT_ROSE_FLOWER, VegetationPlacedFeatures.modifiers(4)));
        entries.add(VIOLET_TREES, placeFeature(entries, VIOLET_TREES_CONFIGURED, PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BlockFilterPlacementModifier.of(BlockPredicate.matchingBlockTag(Direction.DOWN.getVector(), BlockTags.DIRT))));
        entries.add(VIOLET_ROSE_FLOWER, placeFeature(entries, CoreProjectExpansionConfiguredFeatures.VIOLET_ROSE_FLOWER, VegetationPlacedFeatures.modifiers(4)));
        entries.add(CHERRY_TREES, placeFeature(entries, CHERRY_TREES_CONFIGURED, PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BlockFilterPlacementModifier.of(BlockPredicate.matchingBlockTag(Direction.DOWN.getVector(), BlockTags.DIRT))));
        entries.add(CHERRY_ROSE_FLOWER, placeFeature(entries, CoreProjectExpansionConfiguredFeatures.CHERRY_ROSE_FLOWER, VegetationPlacedFeatures.modifiers(4)));
        entries.add(CORE_TREES, placeFeature(entries, CORE_TREES_CONFIGURED, PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BlockFilterPlacementModifier.of(BlockPredicate.matchingBlockTag(Direction.DOWN.getVector(), BlockTags.DIRT))));
        entries.add(BLUEBERRY_BUSH, placeFeature(entries, CoreProjectExpansionConfiguredFeatures.BLUEBERRY_BUSH, VegetationPlacedFeatures.modifiers(6)));
        entries.add(VIBRANT_GRASS, placeFeature(entries, CoreProjectExpansionConfiguredFeatures.VIBRANT_GRASS, VegetationPlacedFeatures.modifiers(16)));
    }

    public static RegistryKey<PlacedFeature> createRegistryKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(CoreProjectExpansionStaticData.ID, name));
    }

    private static PlacedFeature placeFeature(FabricDynamicRegistryProvider.Entries entries, RegistryKey<ConfiguredFeature<?, ?>> feature, PlacementModifier... placementModifiers) {
        List<PlacementModifier> list = new ArrayList<>(List.of(placementModifiers));
        list.add(BiomePlacementModifier.of());
        return placeFeature(entries, feature, list);

    }

    private static PlacedFeature placeFeatureWithoutBiomeFilter(FabricDynamicRegistryProvider.Entries entries, RegistryKey<ConfiguredFeature<?, ?>> feature, PlacementModifier... placementModifiers) {
        List<PlacementModifier> list = new ArrayList<>(List.of(placementModifiers));
        return placeFeature(entries, feature, list);
    }

    private static PlacedFeature placeFeature(FabricDynamicRegistryProvider.Entries entries, RegistryKey<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> list) {
        return new PlacedFeature(entries.ref(feature), list);
    }

    public static void register() {
        LegoLibStaticData.sendMessageToLog(LegoLibStaticData.PREFIX, "registering", "Placed Features");
    }
}
