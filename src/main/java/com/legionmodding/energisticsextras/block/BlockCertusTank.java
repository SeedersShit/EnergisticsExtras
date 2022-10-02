package com.legionmodding.energisticsextras.block;

import com.legionmodding.energisticsextras.tile.TileCertusTank;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class BlockCertusTank extends Block
{
    private static final BooleanProperty ABOVE = BooleanProperty.create("above");
    private static final BooleanProperty BELOW = BooleanProperty.create("below");
    private static final BooleanProperty EMPTY = BooleanProperty.create("empty");
    public BlockCertusTank()
    {
        super(Block.Properties.of(Material.HEAVY_METAL));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(ABOVE);
        builder.add(BELOW);
        builder.add(EMPTY);
    }

    @Override
    public boolean hasTileEntity(BlockState state)
    {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world)
    {
        return new TileCertusTank();
    }
}
