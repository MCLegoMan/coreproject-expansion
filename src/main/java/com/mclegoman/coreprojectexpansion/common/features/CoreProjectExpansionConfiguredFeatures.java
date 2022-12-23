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
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

public class CoreProjectExpansionConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> AZURE_TREE = createRegistryKey("azure_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AZURE_ROSE_FLOWER = createRegistryKey("azure_rose_flower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VIRIDESCENT_TREE = createRegistryKey("viridescent_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VIRIDESCENT_ROSE_FLOWER = createRegistryKey("viridescent_rose_flower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VIOLET_TREE = createRegistryKey("violet_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VIOLET_ROSE_FLOWER = createRegistryKey("violet_rose_flower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHERRY_TREE = createRegistryKey("cherry_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHERRY_ROSE_FLOWER = createRegistryKey("cherry_rose_flower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUEBERRY_BUSH = createRegistryKey("blueberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VIBRANT_GRASS = createRegistryKey("vibrant_grass");

    public static void populate(FabricDynamicRegistryProvider.Entries entries) {
        entries.add(AZURE_TREE, configureFeature(Feature.TREE, CoreProjectExpansionFeatureConfigs.AZURE_TREE_CONFIG));
        entries.add(AZURE_ROSE_FLOWER, configureFeature(Feature.RANDOM_PATCH, CoreProjectExpansionFeatureConfigs.AZURE_ROSE_FLOWER_CONFIG));
        entries.add(VIRIDESCENT_TREE, configureFeature(Feature.TREE, CoreProjectExpansionFeatureConfigs.VIRIDESCENT_TREE_CONFIG));
        entries.add(VIRIDESCENT_ROSE_FLOWER, configureFeature(Feature.RANDOM_PATCH, CoreProjectExpansionFeatureConfigs.VIRIDESCENT_ROSE_FLOWER_CONFIG));
        entries.add(VIOLET_TREE, configureFeature(Feature.TREE, CoreProjectExpansionFeatureConfigs.VIOLET_TREE_CONFIG));
        entries.add(VIOLET_ROSE_FLOWER, configureFeature(Feature.RANDOM_PATCH, CoreProjectExpansionFeatureConfigs.VIOLET_ROSE_FLOWER_CONFIG));
        entries.add(CHERRY_TREE, configureFeature(Feature.TREE, CoreProjectExpansionFeatureConfigs.CHERRY_TREE_CONFIG));
        entries.add(CHERRY_ROSE_FLOWER, configureFeature(Feature.RANDOM_PATCH, CoreProjectExpansionFeatureConfigs.CHERRY_ROSE_FLOWER_CONFIG));
        entries.add(BLUEBERRY_BUSH, configureFeature(Feature.RANDOM_PATCH, CoreProjectExpansionFeatureConfigs.BLUEBERRY_BUSH_CONFIG));
        entries.add(VIBRANT_GRASS, configureFeature(Feature.RANDOM_PATCH, CoreProjectExpansionFeatureConfigs.VIBRANT_GRASS_CONFIG));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> createRegistryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(CoreProjectExpansionStaticData.ID, name));
    }

    public static <FC extends FeatureConfig, F extends Feature<FC>> ConfiguredFeature<FC, ?> configureFeature(F feature, FC config) {
        return new ConfiguredFeature<>(feature, config);
    }

    public static void register() {
        LegoLibStaticData.sendMessageToLog(LegoLibStaticData.PREFIX, "registering", "Configured Features");
    }
}