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

import com.mclegoman.coreprojectexpansion.common.registry.CoreProjectExpansionItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.server.loottable.VanillaBlockLootTableGenerator;

public class CoreProjectExpansionBlockLootTableProvider extends FabricBlockLootTableProvider {
    protected CoreProjectExpansionBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(CoreProjectExpansionItems.AZURE_ROSE);
        addDrop(CoreProjectExpansionItems.VIRIDESCENT_ROSE);
        addDrop(CoreProjectExpansionItems.VIOLET_ROSE);
        addDrop(CoreProjectExpansionItems.CHERRY_ROSE);
        addDrop(CoreProjectExpansionItems.DARKSUNSHYNE);
        addDrop(CoreProjectExpansionItems.X052805X);
        addDrop(CoreProjectExpansionItems.RACHELRABBIT54);
        addDrop(CoreProjectExpansionItems.BIN);
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(0));
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(1));
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(2));
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(3));
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(4));
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(5));
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(6));
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(7));
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(8));
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(9));
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(10));
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(11));
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(12));
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(13), VanillaBlockLootTableGenerator::dropsWithShears);
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(14));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(0));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(1));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(2));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(3));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(4));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(5));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(6));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(7));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(8));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(9));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(10));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(11));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(12));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(13), VanillaBlockLootTableGenerator::dropsWithShears);
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(14));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(0));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(1));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(2));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(3));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(4));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(5));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(6));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(7));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(8));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(9));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(10));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(11));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(12));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(13), VanillaBlockLootTableGenerator::dropsWithShears);
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(14));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(0));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(1));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(2));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(3));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(4));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(5));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(6));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(7));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(8));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(9));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(10));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(11));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(12));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(13), VanillaBlockLootTableGenerator::dropsWithShears);
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(14));
        addPottedPlantDrops(CoreProjectExpansionItems.AzureWoodsetBlocks.get(15));
        addPottedPlantDrops(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(15));
        addPottedPlantDrops(CoreProjectExpansionItems.VioletWoodsetBlocks.get(15));
        addPottedPlantDrops(CoreProjectExpansionItems.CherryWoodsetBlocks.get(15));
        addDrop(CoreProjectExpansionItems.AzureWoodsetBlocks.get(13), leavesDrops(CoreProjectExpansionItems.AzureWoodsetBlocks.get(13), CoreProjectExpansionItems.AzureWoodsetBlocks.get(14), 0.05f, 0.0625f, 0.083333336f, 0.1f));
        addDrop(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(13), leavesDrops(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(13), CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(14), 0.05f, 0.0625f, 0.083333336f, 0.1f));
        addDrop(CoreProjectExpansionItems.VioletWoodsetBlocks.get(13), leavesDrops(CoreProjectExpansionItems.VioletWoodsetBlocks.get(13), CoreProjectExpansionItems.VioletWoodsetBlocks.get(14), 0.05f, 0.0625f, 0.083333336f, 0.1f));
        addDrop(CoreProjectExpansionItems.CherryWoodsetBlocks.get(13), leavesDrops(CoreProjectExpansionItems.CherryWoodsetBlocks.get(13), CoreProjectExpansionItems.CherryWoodsetBlocks.get(14), 0.05f, 0.0625f, 0.083333336f, 0.1f));
        addDrop(CoreProjectExpansionItems.VIBRANT_GRASS, VanillaBlockLootTableGenerator::dropsWithShears);
    }
}