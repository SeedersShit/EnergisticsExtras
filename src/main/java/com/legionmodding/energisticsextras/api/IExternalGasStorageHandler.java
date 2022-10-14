package com.legionmodding.energisticsextras.api;

import appeng.api.networking.security.IActionSource;
import appeng.api.storage.IMEInventory;

import com.legionmodding.energisticsextras.api.gas.IAEGasStack;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;

public interface IExternalGasStorageHandler
{
    /**
     * if this can handle the provided inventory, return true. ( Generally skipped by AE, and it just calls getInventory
     * )
     *
     * @param te    to be handled tile entity
     * @param mySrc source
     * @return true, if it can get a handler via getInventory
     */
    boolean canHandle(TileEntity te, Direction d, IActionSource mySrc);

    /**
     * if this can handle the given inventory, return the a IMEInventory implementing class for it, if not return null
     *
     * @param te  to be handled tile entity
     * @param d   direction
     * @param src source
     * @return The Handler for the inventory
     */
    IMEInventory<IAEGasStack> getInventory(TileEntity te, Direction d, IActionSource src);
}
