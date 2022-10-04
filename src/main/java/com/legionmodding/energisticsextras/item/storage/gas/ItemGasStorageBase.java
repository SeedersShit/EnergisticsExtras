package com.legionmodding.energisticsextras.item.storage.gas;

import com.legionmodding.energisticsextras.util.Reference;
import net.minecraft.item.Item;

public class ItemGasStorageBase extends Item
{
    public ItemGasStorageBase()
    {
        super(new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).stacksTo(1));
    }
}
