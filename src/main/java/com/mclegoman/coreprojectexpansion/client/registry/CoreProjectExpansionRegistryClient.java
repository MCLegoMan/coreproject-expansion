package com.mclegoman.coreprojectexpansion.client.registry;

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
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class CoreProjectExpansionRegistryClient {
    public static void register() {
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.AZURE_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.POTTED_AZURE_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.VIRIDESCENT_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.POTTED_VIRIDESCENT_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.VIOLET_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.POTTED_VIOLET_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.CHERRY_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.POTTED_CHERRY_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.AzureWoodsetBlocks.get(9), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.AzureWoodsetBlocks.get(10), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.AzureWoodsetBlocks.get(14), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.AzureWoodsetBlocks.get(15), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(9), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(10), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(14), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(15), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.VioletWoodsetBlocks.get(9), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.VioletWoodsetBlocks.get(10), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.VioletWoodsetBlocks.get(14), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.VioletWoodsetBlocks.get(15), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.CherryWoodsetBlocks.get(9), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.CherryWoodsetBlocks.get(10), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.CherryWoodsetBlocks.get(14), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.CherryWoodsetBlocks.get(15), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.DARKSUNSHYNE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.RACHELRABBIT54, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.X052805X, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.BIN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.BLUEBERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CoreProjectExpansionItems.VIBRANT_GRASS, RenderLayer.getCutout());
    }
}
