package com.legionmodding.energisticsextras.api;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.math.RayTraceResult;

public interface IWrenchHandler
{

    boolean canWrench(ItemStack item, PlayerEntity user, RayTraceResult rayTraceResult, Hand hand);

    void wrenchUsed(ItemStack item, PlayerEntity user, RayTraceResult rayTraceResult, Hand hand);
}
