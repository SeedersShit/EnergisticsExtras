package com.legionmodding.energisticsextras.util;

import com.legionmodding.energisticsextras.handler.registry.BlockRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Reference
{
    public static final String MOD_ID = "energisticsextras";
    public static final ItemGroup CREATIVE_TAB_BLOCKS = new ItemGroup("tabBlocks")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(BlockRegistry.ENCODER.get());
        }
    };
}
