package com.mclegoman.coreprojectexpansion.common.registry;

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
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CoreProjectExpansionResources {
    public static void registerResourcePacks() {
        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(CoreProjectExpansionStaticData.ID, "player_hats_rp"), CoreProjectExpansionStaticData.CONTAINER, Text.translatable("pack.player_hats.resources.title"), ResourcePackActivationType.ALWAYS_ENABLED);
    }
    public static void registerDatapacks() {
        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(CoreProjectExpansionStaticData.ID, "player_hats_dp"), CoreProjectExpansionStaticData.CONTAINER, Text.translatable("pack.player_hats.data.title"), ResourcePackActivationType.NORMAL);
        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(CoreProjectExpansionStaticData.ID, "goat_horn_dp"), CoreProjectExpansionStaticData.CONTAINER, Text.translatable("pack.goat_horn.data.title"), ResourcePackActivationType.NORMAL);
        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(CoreProjectExpansionStaticData.ID, "expansion_dp"), CoreProjectExpansionStaticData.CONTAINER, Text.translatable("pack.expansion.data.title"), ResourcePackActivationType.NORMAL);
        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(CoreProjectExpansionStaticData.ID, "bio_break_dp"), CoreProjectExpansionStaticData.CONTAINER, Text.translatable("pack.bio_break.data.title"), ResourcePackActivationType.NORMAL);
        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(CoreProjectExpansionStaticData.ID, "world_gen_dp"), CoreProjectExpansionStaticData.CONTAINER, Text.translatable("pack.world_gen.data.title"), ResourcePackActivationType.ALWAYS_ENABLED);
    }
}