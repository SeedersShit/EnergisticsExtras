package com.legionmodding.energisticsextras.item.components;

import com.legionmodding.energisticsextras.util.Reference;
import net.minecraft.item.Item;

public class ItemComponentBase extends Item
{
    public ItemComponentBase()
    {
        super(new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).stacksTo(64));
    }
}
