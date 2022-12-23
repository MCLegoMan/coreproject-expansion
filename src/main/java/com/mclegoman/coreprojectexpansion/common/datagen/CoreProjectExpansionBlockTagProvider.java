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
import com.mclegoman.coreprojectexpansion.common.tags.CoreProjectExpansionBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class CoreProjectExpansionBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    protected CoreProjectExpansionBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup registries) {
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(15))
                .add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(15))
                .add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(15))
                .add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(15));
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(13))
                .add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(13))
                .add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(13))
                .add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(13));
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(13))
                .add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(13))
                .add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(13))
                .add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(13));
        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(CoreProjectExpansionItems.AzureWoodsetBlocks.get(14))
                .add(CoreProjectExpansionItems.ViridescentWoodsetBlocks.get(14))
                .add(CoreProjectExpansionItems.VioletWoodsetBlocks.get(14))
                .add(CoreProjectExpansionItems.CherryWoodsetBlocks.get(14));
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(CoreProjectExpansionItems.VIBRANT_GRASS)
                .add(CoreProjectExpansionItems.AZURE_ROSE)
                .add(CoreProjectExpansionItems.VIRIDESCENT_ROSE)
                .add(CoreProjectExpansionItems.VIOLET_ROSE)
                .add(CoreProjectExpansionItems.CHERRY_ROSE);
        addWood(CoreProjectExpansionBlockTags.AZURE_LOGS, CoreProjectExpansionItems.AzureWoodsetBlocks);
        addWood(CoreProjectExpansionBlockTags.VIRIDESCENT_LOGS, CoreProjectExpansionItems.ViridescentWoodsetBlocks);
        addWood(CoreProjectExpansionBlockTags.VIOLET_LOGS, CoreProjectExpansionItems.VioletWoodsetBlocks);
        addWood(CoreProjectExpansionBlockTags.CHERRY_LOGS, CoreProjectExpansionItems.CherryWoodsetBlocks);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .addTag(CoreProjectExpansionBlockTags.AZURE_LOGS)
                .addTag(CoreProjectExpansionBlockTags.VIRIDESCENT_LOGS)
                .addTag(CoreProjectExpansionBlockTags.VIOLET_LOGS)
                .addTag(CoreProjectExpansionBlockTags.CHERRY_LOGS);
    }

    private void addWood(TagKey<Block> logTag, ArrayList<Block> woodtype) {
        FabricTagBuilder woodBuilder = getOrCreateTagBuilder(logTag);
        getOrCreateTagBuilder(logTag).add(woodtype.get(0));
        getOrCreateTagBuilder(logTag).add(woodtype.get(1));
        getOrCreateTagBuilder(logTag).add(woodtype.get(2));
        getOrCreateTagBuilder(logTag).add(woodtype.get(3));
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(woodtype.get(8));
        getOrCreateTagBuilder(BlockTags.LEAVES).add(woodtype.get(13));
        getOrCreateTagBuilder(BlockTags.PLANKS).add(woodtype.get(4));
        getOrCreateTagBuilder(BlockTags.SLABS).add(woodtype.get(6));
        getOrCreateTagBuilder(BlockTags.STAIRS).add(woodtype.get(5));
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS).add(woodtype.get(12));
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS).add(woodtype.get(9));
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(woodtype.get(7));
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES).add(woodtype.get(11));
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS).add(woodtype.get(6));
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS).add(woodtype.get(5));
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS).add(woodtype.get(10));
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE).add(woodtype.get(13));
    }
}