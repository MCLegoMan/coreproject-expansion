package com.mclegoman.coreprojectexpansion.common.tags;

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
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public final class CoreProjectExpansionBiomeTags {
    @SuppressWarnings("UnnecessaryReturnStatement")
    private CoreProjectExpansionBiomeTags() {
        return;
    }
    private static TagKey<Biome> of(String path) {
        return CoreProjectExpansionBiomeTags.of(new Identifier(CoreProjectExpansionStaticData.ID, path));
    }
    private static TagKey<Biome> of(Identifier id) {
        return TagKey.of(RegistryKeys.BIOME, id);
    }
}
