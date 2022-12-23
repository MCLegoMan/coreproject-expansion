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

import com.mclegoman.coreprojectexpansion.common.CoreProjectExpansionStaticData;
import com.mclegoman.coreprojectexpansion.common.features.CoreProjectExpansionBiomes;
import com.mclegoman.coreprojectexpansion.common.features.CoreProjectExpansionConfiguredFeatures;
import com.mclegoman.coreprojectexpansion.common.features.CoreProjectExpansionPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("UnstableApiUsage")
public class CoreProjectExpansionDynamicRegistryProvider extends FabricDynamicRegistryProvider {
    public CoreProjectExpansionDynamicRegistryProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        CoreProjectExpansionConfiguredFeatures.populate(entries);
        CoreProjectExpansionPlacedFeatures.populate(entries);
        CoreProjectExpansionBiomes.populate(entries);
    }

    @Override
    public String getName() {
        return CoreProjectExpansionStaticData.ID;
    }
}
