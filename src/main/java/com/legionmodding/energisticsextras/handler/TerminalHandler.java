package com.legionmodding.energisticsextras.handler;

import com.legionmodding.energisticsextras.helper.NBTHelper;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;

import java.util.Set;

public class TerminalHandler
{
    public static void setDefaultTagCompound(ItemStack stack)
    {
        if (!stack.hasTag())
        {
            CompoundNBT compound = new CompoundNBT();
            stack.setTag(compound);
        }
        Set<String> keySet = NBTHelper.getTag(stack).getAllKeys();

        if (!keySet.contains("blockstate"))
        {
            NBTHelper.getTag(stack).put("blockstate", NBTUtil.writeBlockState(Blocks.AIR.defaultBlockState()));
        }
        if (!keySet.contains("mode")) {
            NBTHelper.getTag(stack).putInt("mode", 0);
        }
        if (!keySet.contains("range")) {
            NBTHelper.getTag(stack).putInt("range", 0);
        }
        if (!keySet.contains("forceDropItems")) {
            NBTHelper.getTag(stack).putBoolean("forceDropItems", false);
        }
        if (!keySet.contains("directionalPlacement")) {
            NBTHelper.getTag(stack).putBoolean("directionalPlacement", false);
        }
        if (!keySet.contains("fuzzyPlacement")) {
            NBTHelper.getTag(stack).putBoolean("fuzzyPlacement", false);
        }
        if (!keySet.contains("fuzzyPlacementChance")) {
            NBTHelper.getTag(stack).putInt("fuzzyPlacementChance", 100);
        }
        if (!keySet.contains("voidItems")) {
            NBTHelper.getTag(stack).putBoolean("voidItems", false);
        }
    }
}
