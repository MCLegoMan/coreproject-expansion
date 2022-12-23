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

import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

import static com.mclegoman.coreprojectexpansion.common.features.CoreProjectExpansionBiomes.addBasicFeatures;

public class CoreProjectExpansionVibrantFields {
    public static Biome create(FabricDynamicRegistryProvider.Entries entries) {
        return new Biome.Builder()
                .generationSettings(createGenerationSettings(entries))
                .spawnSettings(createSpawnSettings())
                .precipitation(Biome.Precipitation.RAIN)
                .temperature(0.8F)
                .downfall(0.4F)
                .effects(CoreProjectExpansionBiomes.createDefaultBiomeEffects()
                        .grassColor(0x00cc00)
                        .foliageColor(0x00cc00)
                        .build()
                )
                .build();
    }

    private static GenerationSettings createGenerationSettings(FabricDynamicRegistryProvider.Entries entries) {
        GenerationSettings.LookupBackedBuilder builder = new GenerationSettings.LookupBackedBuilder(entries.placedFeatures(), entries.configuredCarvers());
        addBasicFeatures(builder);
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addDefaultDisks(builder);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, entries.ref(CoreProjectExpansionPlacedFeatures.CORE_TREES));
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, entries.ref(CoreProjectExpansionPlacedFeatures.AZURE_ROSE_FLOWER));
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, entries.ref(CoreProjectExpansionPlacedFeatures.VIRIDESCENT_ROSE_FLOWER));
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, entries.ref(CoreProjectExpansionPlacedFeatures.VIOLET_ROSE_FLOWER));
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, entries.ref(CoreProjectExpansionPlacedFeatures.CHERRY_ROSE_FLOWER));
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, entries.ref(CoreProjectExpansionPlacedFeatures.BLUEBERRY_BUSH));
        DefaultBiomeFeatures.addDefaultFlowers(builder);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, entries.ref(CoreProjectExpansionPlacedFeatures.VIBRANT_GRASS));
        DefaultBiomeFeatures.addDefaultVegetation(builder);
        return builder.build();
    }

    private static SpawnSettings createSpawnSettings() {
        SpawnSettings.Builder builder = CoreProjectExpansionBiomes.createDefaultSpawnSettings();
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 5, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 16, 4, 12));
        return builder.build();
    }
}