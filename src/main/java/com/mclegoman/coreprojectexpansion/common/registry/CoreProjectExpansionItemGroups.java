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
import com.mclegoman.legolib.common.LegoLibStaticData;
import com.mclegoman.legolib.debug.LegoLibDebugItemGroups;
import com.mclegoman.legolib.debug.LegoLibDebugItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.Identifier;

public class CoreProjectExpansionItemGroups {
    public static final ItemGroup WOODSETS = FabricItemGroup.builder(new Identifier(CoreProjectExpansionStaticData.ID, "woodsets"))
            .icon(() -> new ItemStack(CoreProjectExpansionItems.AzureWoodsetBlocks.get(0)))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                if(enabledFeatures.contains(FeatureFlags.VANILLA)){
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(0));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(1));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(2));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(3));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(4));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(5));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(6));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(7));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(8));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(9));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(10));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(11));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(12));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(13));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(14));
                    entries.add(CoreProjectExpansionItems.AzureWoodsetItems.get(0));
                    entries.add(CoreProjectExpansionItems.AZURE_FRUIT);
                    entries.add(CoreProjectExpansionItems.AZURE_ROSE);
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(0));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(1));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(2));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(3));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(4));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(5));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(6));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(7));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(8));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(9));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(10));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(11));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(12));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(13));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(14));
                    entries.add(CoreProjectExpansionItems.ViridescentWoodsetItems.get(0));
                    entries.add(CoreProjectExpansionItems.VIRIDESCENT_FRUIT);
                    entries.add(CoreProjectExpansionItems.VIRIDESCENT_ROSE);
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(0));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(1));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(2));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(3));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(4));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(5));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(6));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(7));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(8));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(9));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(10));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(11));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(12));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(13));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(14));
                    entries.add(CoreProjectExpansionItems.VioletWoodsetItems.get(0));
                    entries.add(CoreProjectExpansionItems.VIOLET_FRUIT);
                    entries.add(CoreProjectExpansionItems.VIOLET_ROSE);
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(0));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(1));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(2));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(3));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(4));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(5));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(6));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(7));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(8));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(9));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(10));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(11));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(12));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(13));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(14));
                    entries.add(CoreProjectExpansionItems.CherryWoodsetItems.get(0));
                    entries.add(CoreProjectExpansionItems.CHERRY);
                    entries.add(CoreProjectExpansionItems.CHERRY_ROSE);
                    entries.add(CoreProjectExpansionItems.VIBRANT_GRASS);
                }}).build();

    public static final ItemGroup PLAYERHATS = FabricItemGroup.builder(new Identifier(CoreProjectExpansionStaticData.ID, "playerhats"))
            .icon(() -> new ItemStack(CoreProjectExpansionItems.ROGOOEY))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                if(enabledFeatures.contains(FeatureFlags.VANILLA)){
                    entries.add(CoreProjectExpansionItems.MCLEGOMAN);
                    entries.add(CoreProjectExpansionItems.MCLEGOGOAT);
                    entries.add(CoreProjectExpansionItems.DARKSUNSHYNE);
                    entries.add(CoreProjectExpansionItems.DUCKSYY_);
                    entries.add(CoreProjectExpansionItems.XXFOXYTUBEXX);
                    entries.add(CoreProjectExpansionItems.LEWIS_PLAYS);
                    entries.add(CoreProjectExpansionItems.MAJIKZ);
                    entries.add(CoreProjectExpansionItems.ROGOOEY);
                    entries.add(CoreProjectExpansionItems.X052805X);
                    entries.add(CoreProjectExpansionItems.RACHELRABBIT54);
                    entries.add(CoreProjectExpansionItems.DER_WAFFELMAN);
                    entries.add(CoreProjectExpansionItems.ZOMBIEGIRL_MC);
                    entries.add(CoreProjectExpansionItems.MUSTACHE);
                    entries.add(CoreProjectExpansionItems.BIN);
                    entries.add(CoreProjectExpansionItems.REPORTER);
                    entries.add(CoreProjectExpansionItems.STRAW_HAT);
                    entries.add(CoreProjectExpansionItems.CAT_EARS);
                }}).build();

    public static final ItemGroup MISC = FabricItemGroup.builder(new Identifier(CoreProjectExpansionStaticData.ID, "misc"))
            .icon(() -> new ItemStack(CoreProjectExpansionItems.FIRE_TOTEM))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                if(enabledFeatures.contains(FeatureFlags.VANILLA)){
                    entries.add(CoreProjectExpansionItems.FIRE_TOTEM);
                    entries.add(CoreProjectExpansionItems.WATER_TOTEM);
                    entries.add(LegoLibDebugItems.DEBUG_UDRS);
                    entries.add(LegoLibDebugItems.DEBUG_SHORT);
                    entries.add(LegoLibDebugItems.DEBUG_TALL);
                }}).build();
    public static void register() {
        LegoLibStaticData.sendMessageToLog(CoreProjectExpansionStaticData.PREFIX, "registering", "ItemGroups");
    }
}
