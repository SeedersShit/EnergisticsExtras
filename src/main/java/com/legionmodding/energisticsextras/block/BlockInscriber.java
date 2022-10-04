package com.legionmodding.energisticsextras.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;

public class BlockInscriber extends Block
{
    private static final BooleanProperty ACTIVE = BooleanProperty.create("active");
    public BlockInscriber()
    {
        super(Block.Properties.of(Material.HEAVY_METAL));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(ACTIVE);
        super.createBlockStateDefinition(builder);
    }
}
