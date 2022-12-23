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
import com.mclegoman.coreprojectexpansion.server.CoreProjectExpansionServer;
import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.*;

import java.util.function.Consumer;

public class CoreProjectExpansionTerraBlender extends Region implements Runnable, TerraBlenderApi {

    public CoreProjectExpansionTerraBlender() {
        super(new Identifier(CoreProjectExpansionStaticData.ID, "overworld"), RegionType.OVERWORLD, 13);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, CoreProjectExpansionBiomes.AZURE_FIELDS);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, CoreProjectExpansionBiomes.VIRIDESCENT_FIELDS);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, CoreProjectExpansionBiomes.VIOLET_FIELDS);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, CoreProjectExpansionBiomes.CHERRY_FIELDS);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, CoreProjectExpansionBiomes.VIBRANT_FIELDS);
    }

    @Override
    public void onTerraBlenderInitialized() {
        CoreProjectExpansionServer.callbackWhenInitialized(this);
    }

    @Override
    public void run() {
        Regions.register(this);
    }
}