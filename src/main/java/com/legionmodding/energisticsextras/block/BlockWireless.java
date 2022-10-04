package com.legionmodding.energisticsextras.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;

public class BlockWireless extends Block
{
    private static final BooleanProperty ACTIVE = BooleanProperty.create("active");
    public BlockWireless()
    {
        super(Block.Properties.of(Material.HEAVY_METAL));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(ACTIVE);
    }
}
