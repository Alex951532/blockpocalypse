package com.enderalex951.blockpocalypse.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModObeliskPillar extends Block {

    public ModObeliskPillar(Properties properties) {
        super(properties);

    }

    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos position, ISelectionContext context) {
        return Block.makeCuboidShape(2.0, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);
    }

}