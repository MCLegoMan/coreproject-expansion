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
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

import static net.minecraft.data.client.BlockStateModelGenerator.*;

public class CoreProjectExpansionModelProvider extends FabricModelProvider {

    public CoreProjectExpansionModelProvider(FabricDataOutput output) {
        super(output);
    }
    public void registerSlab(BlockStateModelGenerator blockStateModelGenerator, Block slabBlock, Block parentBlock) {
        TextureMap textureMap = TextureMap.all(parentBlock);
        TextureMap textureMap2 = TextureMap.sideEnd(TextureMap.getSubId(parentBlock, ""), textureMap.getTexture(TextureKey.TOP));
        Identifier identifier = Models.SLAB.upload(slabBlock, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = Models.SLAB_TOP.upload(slabBlock, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier3 = Models.CUBE_COLUMN.uploadWithoutVariant(slabBlock, "_double", textureMap2, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSlabBlockState(slabBlock, identifier, identifier2, identifier3));
    }
    public void registerStairs(BlockStateModelGenerator blockStateModelGenerator, Block stairsBlock, Block parentBlock) {
        TextureMap textureMap = TextureMap.all(parentBlock);
        Identifier inner = Models.INNER_STAIRS.upload(stairsBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier stairs = Models.STAIRS.upload(stairsBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier outer = Models.OUTER_STAIRS.upload(stairsBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createStairsBlockState(stairsBlock, inner, stairs, outer));
    }
    public void registerFence(BlockStateModelGenerator blockStateModelGenerator, Block fenceBlock, Block parentBlock) {
        TextureMap textureMap = TextureMap.all(parentBlock);
        Identifier post = Models.FENCE_POST.upload(fenceBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier side = Models.FENCE_SIDE.upload(fenceBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier inventory = Models.FENCE_INVENTORY.upload(fenceBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createFenceBlockState(fenceBlock, post, side));
        blockStateModelGenerator.registerParentedItemModel(fenceBlock, inventory);
    }
    public void registerFenceGate(BlockStateModelGenerator blockStateModelGenerator, Block fencegateBlock, Block parentBlock) {
        TextureMap textureMap = TextureMap.all(parentBlock);
        Identifier fence_gate = Models.TEMPLATE_FENCE_GATE.upload(fencegateBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier fence_gate_open = Models.TEMPLATE_FENCE_GATE_OPEN.upload(fencegateBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier fence_gate_wall = Models.TEMPLATE_FENCE_GATE_WALL.upload(fencegateBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier fence_gate_wall_open = Models.TEMPLATE_FENCE_GATE_WALL_OPEN.upload(fencegateBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createFenceGateBlockState(fencegateBlock, fence_gate_open, fence_gate, fence_gate_wall_open, fence_gate_wall, false));
    }
    public void registerPressurePlate(BlockStateModelGenerator blockStateModelGenerator, Block pressureplateBlock, Block parentBlock) {
        TextureMap textureMap = TextureMap.all(parentBlock);
        Identifier pressureplate_up = Models.PRESSURE_PLATE_UP.upload(pressureplateBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier pressureplate_down = Models.PRESSURE_PLATE_DOWN.upload(pressureplateBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createPressurePlateBlockState(pressureplateBlock, pressureplate_up, pressureplate_down));
    }
    public void registerButton(BlockStateModelGenerator blockStateModelGenerator, Block buttonBlock, Block parentBlock) {
        TextureMap textureMap = TextureMap.all(parentBlock);
        Identifier button = Models.BUTTON.upload(buttonBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier pressed = Models.BUTTON_PRESSED.upload(buttonBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier inventory = Models.BUTTON_INVENTORY.upload(buttonBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createButtonBlockState(buttonBlock, button, pressed));
        blockStateModelGenerator.registerParentedItemModel(buttonBlock, inventory);
    }
    public void registerSign(BlockStateModelGenerator blockStateModelGenerator, Block signBlock, Block signWallBlock, Block parentBlock) {
        TextureMap textureMap = TextureMap.all(parentBlock);
        Identifier sign = Models.PARTICLE.upload(signBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier wallSign = Models.PARTICLE.upload(signWallBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(signBlock, sign));
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(signWallBlock, wallSign));
        blockStateModelGenerator.excludeFromSimpleItemModelGeneration(signBlock);
        blockStateModelGenerator.excludeFromSimpleItemModelGeneration(signWallBlock);
    }
    private void registerBerryBush(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(BlockStateVariantMap.create(Properties.AGE_3).register((stage) -> {
            return BlockStateVariant.create().put(VariantSettings.MODEL, blockStateModelGenerator.createSubModel(block, "_stage" + stage, Models.CROSS, TextureMap::cross));
        })));
    }
    public void registerWoodsetBlocks(BlockStateModelGenerator blockStateModelGenerator, ArrayList<Block> woodsetBlocks) {
        blockStateModelGenerator.registerLog(woodsetBlocks.get(0)).log(woodsetBlocks.get(0)).wood(woodsetBlocks.get(1));
        blockStateModelGenerator.registerLog(woodsetBlocks.get(2)).log(woodsetBlocks.get(2)).wood(woodsetBlocks.get(3));
        blockStateModelGenerator.registerCubeAllModelTexturePool(woodsetBlocks.get(4));
        registerStairs(blockStateModelGenerator, woodsetBlocks.get(5), woodsetBlocks.get(4));
        registerSlab(blockStateModelGenerator, woodsetBlocks.get(6), woodsetBlocks.get(4));
        registerFence(blockStateModelGenerator, woodsetBlocks.get(7), woodsetBlocks.get(4));
        registerFenceGate(blockStateModelGenerator, woodsetBlocks.get(8), woodsetBlocks.get(4));
        blockStateModelGenerator.registerDoor(woodsetBlocks.get(9));
        blockStateModelGenerator.registerTrapdoor(woodsetBlocks.get(10));
        registerPressurePlate(blockStateModelGenerator, woodsetBlocks.get(11), woodsetBlocks.get(4));
        registerButton(blockStateModelGenerator, woodsetBlocks.get(12), woodsetBlocks.get(4));
        blockStateModelGenerator.registerCubeAllModelTexturePool(woodsetBlocks.get(13));
        blockStateModelGenerator.registerFlowerPotPlant(woodsetBlocks.get(14), woodsetBlocks.get(15), BlockStateModelGenerator.TintType.NOT_TINTED);
        registerSign(blockStateModelGenerator, woodsetBlocks.get(16), woodsetBlocks.get(17), woodsetBlocks.get(4));
    }
    public void registerWoodsetItems(ItemModelGenerator itemModelGenerator, ArrayList<Item> woodsetItems, Item fruit) {
        itemModelGenerator.register(fruit, Models.GENERATED);
        itemModelGenerator.register(woodsetItems.get(0), Models.GENERATED);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        registerWoodsetBlocks(blockStateModelGenerator, CoreProjectExpansionItems.AzureWoodsetBlocks);
        blockStateModelGenerator.registerFlowerPotPlant(CoreProjectExpansionItems.AZURE_ROSE, CoreProjectExpansionItems.POTTED_AZURE_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        registerWoodsetBlocks(blockStateModelGenerator, CoreProjectExpansionItems.ViridescentWoodsetBlocks);
        blockStateModelGenerator.registerFlowerPotPlant(CoreProjectExpansionItems.VIRIDESCENT_ROSE, CoreProjectExpansionItems.POTTED_VIRIDESCENT_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        registerWoodsetBlocks(blockStateModelGenerator, CoreProjectExpansionItems.VioletWoodsetBlocks);
        blockStateModelGenerator.registerFlowerPotPlant(CoreProjectExpansionItems.VIOLET_ROSE, CoreProjectExpansionItems.POTTED_VIOLET_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        registerWoodsetBlocks(blockStateModelGenerator, CoreProjectExpansionItems.CherryWoodsetBlocks);
        blockStateModelGenerator.registerFlowerPotPlant(CoreProjectExpansionItems.CHERRY_ROSE, CoreProjectExpansionItems.POTTED_CHERRY_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(CoreProjectExpansionItems.VIBRANT_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);
        registerBerryBush(blockStateModelGenerator, CoreProjectExpansionItems.BLUEBERRY_BUSH);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        registerWoodsetItems(itemModelGenerator, CoreProjectExpansionItems.AzureWoodsetItems, CoreProjectExpansionItems.AZURE_FRUIT);
        registerWoodsetItems(itemModelGenerator, CoreProjectExpansionItems.ViridescentWoodsetItems, CoreProjectExpansionItems.VIRIDESCENT_FRUIT);
        registerWoodsetItems(itemModelGenerator,  CoreProjectExpansionItems.VioletWoodsetItems, CoreProjectExpansionItems.VIOLET_FRUIT);
        registerWoodsetItems(itemModelGenerator, CoreProjectExpansionItems.CherryWoodsetItems, CoreProjectExpansionItems.CHERRY);
        itemModelGenerator.register(CoreProjectExpansionItems.FIRE_TOTEM, Models.GENERATED);
        itemModelGenerator.register(CoreProjectExpansionItems.WATER_TOTEM, Models.GENERATED);
        itemModelGenerator.register(CoreProjectExpansionItems.BLUEBERRY_BUSH.asItem(), Models.GENERATED);
    }
}
