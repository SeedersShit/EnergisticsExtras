package com.legionmodding.energisticsextras.tile;

import com.legionmodding.energisticsextras.handler.registry.TileRegistry;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileCertusTank extends TileEntity implements ITickableTileEntity
{
    public TileCertusTank()
    {
        super(TileRegistry.CERTUS_TANK.get());
    }

    @Override
    public void tick()
    {

    }
}
