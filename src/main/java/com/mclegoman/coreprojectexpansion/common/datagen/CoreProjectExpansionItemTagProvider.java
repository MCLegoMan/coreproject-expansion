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
import com.mclegoman.coreprojectexpansion.common.tags.CoreProjectExpansionItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class CoreProjectExpansionItemTagProvider extends FabricTagProvider.ItemTagProvider {
    protected CoreProjectExpansionItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup registries) {
        addWood(CoreProjectExpansionItemTags.AZURE_LOGS, CoreProjectExpansionItems.AzureWoodsetBlocks);
        addWood(CoreProjectExpansionItemTags.VIRIDESCENT_LOGS, CoreProjectExpansionItems.ViridescentWoodsetBlocks);
        addWood(CoreProjectExpansionItemTags.VIOLET_LOGS, CoreProjectExpansionItems.VioletWoodsetBlocks);
        addWood(CoreProjectExpansionItemTags.CHERRY_LOGS, CoreProjectExpansionItems.CherryWoodsetBlocks);
        getOrCreateTagBuilder(ItemTags.LOGS)
                .addTag(CoreProjectExpansionItemTags.AZURE_LOGS)
                .addTag(CoreProjectExpansionItemTags.VIRIDESCENT_LOGS)
                .addTag(CoreProjectExpansionItemTags.VIOLET_LOGS)
                .addTag(CoreProjectExpansionItemTags.CHERRY_LOGS);
    }

    private void addWood(TagKey<Item> logTag, ArrayList<Block> woodtype) {
        FabricTagBuilder woodBuilder = getOrCreateTagBuilder(logTag);
        getOrCreateTagBuilder(logTag).add(woodtype.get(0).asItem());
        getOrCreateTagBuilder(logTag).add(woodtype.get(1).asItem());
        getOrCreateTagBuilder(logTag).add(woodtype.get(2).asItem());
        getOrCreateTagBuilder(logTag).add(woodtype.get(3).asItem());
    }
}