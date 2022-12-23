package com.mclegoman.coreprojectexpansion.common.datagen;

/*
 CoreProject: Expansion Pack 1.0.0
 https://github.com/MCLegoMan/coreproject-expansion

 Author: Daniel-Tayden Larsen (MCLegoMan)
 License: MCLM-OSL (2022)

 IMPORTANT:
 This notice must not be removed.
 When modifying this code, you must add a note stating that you modified it.
 */

import com.mclegoman.coreprojectexpansion.common.features.CoreProjectExpansionBiomes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBiomeTags;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.biome.Biome;

import java.util.concurrent.CompletableFuture;

public class CoreProjectExpansionBiomeTagProvider extends FabricTagProvider<Biome> {
    protected CoreProjectExpansionBiomeTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BIOME, registriesFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup registries) {
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ConventionalBiomeTags.CLIMATE_TEMPERATE.id()))
                .addOptional(CoreProjectExpansionBiomes.AZURE_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIRIDESCENT_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIOLET_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.CHERRY_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIBRANT_FIELDS);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ConventionalBiomeTags.IN_OVERWORLD.id()))
                .addOptional(CoreProjectExpansionBiomes.AZURE_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIRIDESCENT_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIOLET_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.CHERRY_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIBRANT_FIELDS);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, BiomeTags.MINESHAFT_HAS_STRUCTURE.id()))
                .addOptional(CoreProjectExpansionBiomes.AZURE_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIRIDESCENT_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIOLET_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.CHERRY_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIBRANT_FIELDS);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, BiomeTags.RUINED_PORTAL_STANDARD_HAS_STRUCTURE.id()))
                .addOptional(CoreProjectExpansionBiomes.AZURE_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIRIDESCENT_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIOLET_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.CHERRY_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIBRANT_FIELDS);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, BiomeTags.VILLAGE_PLAINS_HAS_STRUCTURE.id()))
                .addOptional(CoreProjectExpansionBiomes.AZURE_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIRIDESCENT_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIOLET_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.CHERRY_FIELDS)
                .addOptional(CoreProjectExpansionBiomes.VIBRANT_FIELDS);
    }
}