package com.legionmodding.energisticsextras.api;

import appeng.api.features.INetworkEncodable;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public interface IWirelessGasFluidTermHandler extends INetworkEncodable
{
    boolean canHandle(ItemStack is);

    boolean hasPower(PlayerEntity player, double amount, ItemStack is);

    boolean isItemNormalWirelessTermToo(ItemStack is);

    boolean usePower(PlayerEntity player, double amount, ItemStack is);
}
