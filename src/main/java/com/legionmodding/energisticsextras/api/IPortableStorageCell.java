package com.legionmodding.energisticsextras.api;

import appeng.api.storage.cells.ICellWorkbenchItem;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public interface IPortableStorageCell extends ICellWorkbenchItem
{

    boolean hasPower(PlayerEntity player, double amount, ItemStack is);

    boolean usePower(PlayerEntity player, double amount, ItemStack is);
}
