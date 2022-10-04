package com.legionmodding.energisticsextras.item.storage.fluid;

import com.legionmodding.energisticsextras.util.Reference;
import net.minecraft.item.Item;

public class ItemFluidStorageBase extends Item
{
    public ItemFluidStorageBase()
    {
        super(new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).stacksTo(1));
    }
}
