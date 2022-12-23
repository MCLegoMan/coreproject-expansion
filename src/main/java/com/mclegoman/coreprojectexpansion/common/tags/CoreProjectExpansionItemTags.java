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
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class CoreProjectExpansionItemTags {
    public static final TagKey<Item> AZURE_LOGS = CoreProjectExpansionItemTags.of("azure_logs");
    public static final TagKey<Item> VIRIDESCENT_LOGS = CoreProjectExpansionItemTags.of("viridescent_logs");
    public static final TagKey<Item> VIOLET_LOGS = CoreProjectExpansionItemTags.of("violet_logs");
    public static final TagKey<Item> CHERRY_LOGS = CoreProjectExpansionItemTags.of("cherry_logs");

    @SuppressWarnings("UnnecessaryReturnStatement")
    private CoreProjectExpansionItemTags() {
        return;
    }

    private static TagKey<Item> of(String path) {
        return CoreProjectExpansionItemTags.of(Identifier.of(CoreProjectExpansionStaticData.ID, path));
    }

    private static TagKey<Item> of(Identifier id) {
        return TagKey.of(RegistryKeys.ITEM, id);
    }
}