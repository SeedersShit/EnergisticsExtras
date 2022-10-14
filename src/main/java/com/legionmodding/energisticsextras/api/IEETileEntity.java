package com.legionmodding.energisticsextras.api;

import appeng.api.networking.IGridHost;
import appeng.api.util.DimensionalCoord;

public interface IEETileEntity extends IGridHost
{
    DimensionalCoord getLocation();

    double getPowerUsage();

}
