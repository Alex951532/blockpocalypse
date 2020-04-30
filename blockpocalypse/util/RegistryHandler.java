package com.enderalex951.blockpocalypse.util;

import com.enderalex951.blockpocalypse.Blockpocalypse;
import com.enderalex951.blockpocalypse.blocks.ModObeliskPillar;
import com.enderalex951.blockpocalypse.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Blockpocalypse.MOD_ID);

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Blockpocalypse.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> TEST = ITEMS.register("test_item", ItemBase::new);
    public static final RegistryObject<Item> GREEN_GEM = ITEMS.register("green_gem", ItemBase::new);



    // Blocks
    public static final RegistryObject<Block> GREEN_ORE = BLOCKS.register("greenium_ore", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).hardnessAndResistance(1.5F, 6.0F)));

    public static final RegistryObject<Block> RUNESLATE = BLOCKS.register("bcp_rune_slate", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(1.5F, 6.0F)));
    public static final RegistryObject<Block> STONE_RUNE_SUN = BLOCKS.register("stone_rune_sun", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(1.5F, 6.0F).lightValue(15)));
    public static final RegistryObject<Block> STONE_RUNE_AIR = BLOCKS.register("stone_rune_air", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(1.5F, 6.0F).slipperiness(1.003F)));
    public static final RegistryObject<Block> STONE_RUNE_VOID = BLOCKS.register("stone_rune_void", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(1.5F, 6.0F).doesNotBlockMovement()));
    public static final RegistryObject<Block> STONE_RUNE_ROCK = BLOCKS.register("stone_rune_rock", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(40.0F, 1200.0F)));

    public static final RegistryObject<Block> LOSS_BLOCK = BLOCKS.register("loss_rune", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(1.5F, 6.0F)));
    public static final RegistryObject<Block> AZTEC_GUARDIAN = BLOCKS.register("aztec_guardian_block", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(1.5F, 6.0F)));
    public static final RegistryObject<Block> STONE_PILLAR = BLOCKS.register("stone_pillar_block", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(1.5F, 6.0F)));

    public static final RegistryObject<Block> SANDSTONE_BRICKS = BLOCKS.register("sandstone_bricks", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(1.5F, 6.0F)));
    public static final RegistryObject<Block> OBELISK_COLUMN_1 = BLOCKS.register("obelisk_column_1", () -> new ModObeliskPillar(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(1.5F, 6.0F).notSolid()));


    //ItemBlocks
    public static final RegistryObject<Item> GREEN_ORE_ITEM = ITEMS.register("greenium_ore", () -> new BlockItem(RegistryHandler.GREEN_ORE.get(), new Item.Properties().group(Blockpocalypse.TAB)));

    public static final RegistryObject<Item> RUNESLATE_ITEM = ITEMS.register("bcp_rune_slate", () -> new BlockItem(RegistryHandler.RUNESLATE.get(), new Item.Properties().group(Blockpocalypse.TAB)));
    public static final RegistryObject<Item> STONE_RUNE_SUN_ITEM = ITEMS.register("stone_rune_sun", () -> new BlockItem(RegistryHandler.STONE_RUNE_SUN.get(), new Item.Properties().group(Blockpocalypse.TAB)));
    public static final RegistryObject<Item> STONE_RUNE_AIR_ITEM = ITEMS.register("stone_rune_air", () -> new BlockItem(RegistryHandler.STONE_RUNE_AIR.get(), new Item.Properties().group(Blockpocalypse.TAB)));
    public static final RegistryObject<Item> STONE_RUNE_VOID_ITEM = ITEMS.register("stone_rune_void", () -> new BlockItem(RegistryHandler.STONE_RUNE_VOID.get(), new Item.Properties().group(Blockpocalypse.TAB)));
    public static final RegistryObject<Item> STONE_RUNE_ROCK_ITEM = ITEMS.register("stone_rune_rock", () -> new BlockItem(RegistryHandler.STONE_RUNE_ROCK.get(), new Item.Properties().group(Blockpocalypse.TAB)));

    public static final RegistryObject<Item> LOSS_ITEM = ITEMS.register("loss_rune", () -> new BlockItem(RegistryHandler.LOSS_BLOCK.get(), new Item.Properties().group(Blockpocalypse.TAB)));
    public static final RegistryObject<Item> AZTEC_GUARDIAN_ITEM = ITEMS.register("aztec_guardian_block", () -> new BlockItem(RegistryHandler.AZTEC_GUARDIAN.get(), new Item.Properties().group(Blockpocalypse.TAB)));
    public static final RegistryObject<Item> STONE_PILLAR_ITEM = ITEMS.register("stone_pillar_block", () -> new BlockItem(RegistryHandler.STONE_PILLAR.get(), new Item.Properties().group(Blockpocalypse.TAB)));

    public static final RegistryObject<Item> SANDSTONE_BRICKS_ITEM = ITEMS.register("sandstone_bricks", () -> new BlockItem(RegistryHandler.SANDSTONE_BRICKS.get(), new Item.Properties().group(Blockpocalypse.TAB)));
    public static final RegistryObject<Item> OBELISK_COLUMN_1_ITEM = ITEMS.register("obelisk_column_1", () -> new BlockItem(RegistryHandler.OBELISK_COLUMN_1.get(), new Item.Properties().group(Blockpocalypse.TAB)));

}

