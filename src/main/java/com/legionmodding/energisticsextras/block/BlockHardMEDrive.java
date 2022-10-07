package com.legionmodding.energisticsextras.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

import javax.annotation.Nullable;

public class BlockHardMEDrive extends Block
{
    private static final DirectionProperty FACING = HorizontalBlock.FACING;
    public BlockHardMEDrive()
    {
        super(Block.Properties.of(Material.HEAVY_METAL));

        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH));
    }
    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(FACING);
        super.createBlockStateDefinition(builder);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot)
    {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }
}
