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
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

import java.util.List;

@SuppressWarnings("UnstableApiUsage")
public class CoreProjectExpansionBiomes {
    public static final RegistryKey<Biome> AZURE_FIELDS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(CoreProjectExpansionStaticData.ID, "azure_fields"));
    public static final RegistryKey<Biome> VIRIDESCENT_FIELDS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(CoreProjectExpansionStaticData.ID, "viridescent_fields"));
    public static final RegistryKey<Biome> VIOLET_FIELDS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(CoreProjectExpansionStaticData.ID, "violet_fields"));
    public static final RegistryKey<Biome> CHERRY_FIELDS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(CoreProjectExpansionStaticData.ID, "cherry_fields"));
    public static final RegistryKey<Biome> VIBRANT_FIELDS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(CoreProjectExpansionStaticData.ID, "vibrant_fields"));

    public static final List<RegistryKey<Biome>> BIOMES = List.of(
            AZURE_FIELDS,
            VIRIDESCENT_FIELDS,
            VIOLET_FIELDS,
            CHERRY_FIELDS,
            VIBRANT_FIELDS
    );

    public static void populate(FabricDynamicRegistryProvider.Entries entries) {
        entries.add(AZURE_FIELDS, CoreProjectExpansionAzureFields.create(entries));
        entries.add(VIRIDESCENT_FIELDS, CoreProjectExpansionViridescentFields.create(entries));
        entries.add(VIOLET_FIELDS, CoreProjectExpansionVioletFields.create(entries));
        entries.add(CHERRY_FIELDS, CoreProjectExpansionCherryFields.create(entries));
        entries.add(VIBRANT_FIELDS, CoreProjectExpansionVibrantFields.create(entries));
    }

    static void addBasicFeatures(GenerationSettings.LookupBackedBuilder generationSettings) {
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addAmethystGeodes(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
    }

    public static SpawnSettings.Builder createDefaultSpawnSettings() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        addDefaultCreatureSpawnEntries(spawnSettings);
        addDefaultAmbientSpawnEntries(spawnSettings);
        addDefaultMonsterSpawnEntries(spawnSettings);
        return spawnSettings;
    }

    public static void addDefaultCreatureSpawnEntries(SpawnSettings.Builder builder) {
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.SHEEP, 12, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PIG, 10, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.CHICKEN, 10, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.COW, 8, 4, 4));
    }

    public static void addDefaultAmbientSpawnEntries(SpawnSettings.Builder builder) {
        builder.spawn(SpawnGroup.AMBIENT, new SpawnSettings.SpawnEntry(EntityType.BAT, 10, 8, 8));
    }

    public static void addDefaultMonsterSpawnEntries(SpawnSettings.Builder builder) {
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SPIDER, 100, 4, 4));
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ZOMBIE, 95, 4, 4));
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SKELETON, 100, 4, 4));
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.CREEPER, 100, 4, 4));
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SLIME, 100, 4, 4));
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.WITCH, 5, 1, 1));
    }

    public static BiomeEffects.Builder createDefaultBiomeEffects() {
        return new BiomeEffects.Builder()
                .waterColor(0x3F76E4)
                .waterFogColor(0x50533)
                .skyColor(getSkyColor(0.2F))
                .fogColor(0xC0D8FF);
    }

    private static int getSkyColor(float temperature) {
        float f = temperature / 3.0F;
        f = MathHelper.clamp(f, -1.0F, 1.0F);
        return MathHelper.hsvToRgb(0.62222224F - f * 0.05F, 0.5F + f * 0.1F, 1.0F);
    }

    public static void register() {
    }
}