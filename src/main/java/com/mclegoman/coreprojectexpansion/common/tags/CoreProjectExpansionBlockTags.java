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
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class CoreProjectExpansionBlockTags {
    public static final TagKey<Block> AZURE_LOGS = CoreProjectExpansionBlockTags.of("azure_logs");
    public static final TagKey<Block> VIRIDESCENT_LOGS = CoreProjectExpansionBlockTags.of("viridescent_logs");
    public static final TagKey<Block> VIOLET_LOGS = CoreProjectExpansionBlockTags.of("violet_logs");
    public static final TagKey<Block> CHERRY_LOGS = CoreProjectExpansionBlockTags.of("cherry_logs");

    @SuppressWarnings("UnnecessaryReturnStatement")
    private CoreProjectExpansionBlockTags() {
        return;
    }

    private static TagKey<Block> of(String path) {
        return CoreProjectExpansionBlockTags.of(new Identifier(CoreProjectExpansionStaticData.ID, path));
    }

    private static TagKey<Block> of(Identifier id) {
        return TagKey.of(RegistryKeys.BLOCK, id);
    }
}