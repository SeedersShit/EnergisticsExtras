package com.legionmodding.energisticsextras.item.storage.item;

import com.legionmodding.energisticsextras.util.Reference;
import net.minecraft.item.Item;

public class ItemStorageBase extends Item
{
    public ItemStorageBase()
    {
        super(new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).stacksTo(1));
    }
}
