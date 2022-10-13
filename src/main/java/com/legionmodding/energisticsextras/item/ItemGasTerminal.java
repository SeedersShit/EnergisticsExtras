package com.legionmodding.energisticsextras.item;

import com.legionmodding.energisticsextras.capability.EnergyItemCapability;
import com.legionmodding.energisticsextras.capability.EnergyStorageCapability;
import com.legionmodding.energisticsextras.capability.IEnergyContainer;
import com.legionmodding.energisticsextras.handler.TerminalHandler;
import com.legionmodding.energisticsextras.helper.EnergyHelper;
import com.legionmodding.energisticsextras.helper.KeyboardHelper;
import com.legionmodding.energisticsextras.helper.StringHelper;
import com.legionmodding.energisticsextras.util.ILoadable;
import com.legionmodding.energisticsextras.util.ITerminal;
import com.legionmodding.energisticsextras.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.inventory.InventoryScreen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

import javax.annotation.Nullable;
import java.util.List;

public class ItemGasTerminal extends Item implements IEnergyContainer, ITerminal, ILoadable
{
    public ItemGasTerminal()
    {
        super(new Item.Properties().stacksTo(1).tab(Reference.CREATIVE_TAB_ITEMS));
    }


    @Override
    public int receiveEnergy(ItemStack container, int energy, boolean simulate)
    {
        return EnergyHelper.receiveEnergy(container, energy, simulate);
    }

    @Override
    public int extractEnergy(ItemStack container, int energy, boolean simulate)
    {
        return EnergyHelper.extractEnergy(container, energy, simulate);
    }

    @Override
    public int getEnergyStored(ItemStack container)
    {
        return EnergyHelper.getEnergyStored(container);
    }

    @Override
    public int getMaxEnergyStored(ItemStack container)
    {
        return 1600000;
    }

    @Override
    public boolean showDurabilityBar(ItemStack stack)
    {
        return true;
    }

    @Override
    public double getDurabilityForDisplay(ItemStack stack)
    {
        if (stack.getTag() == null)
        {
            EnergyHelper.setDefaultEnergyTag(stack, 0);
        }
        return 1D - ((double) stack.getTag().getInt(EnergyHelper.ENERGY_NBT) / (double) getMaxEnergyStored(stack));
    }

    @Override
    public void appendHoverText(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag)
    {
        super.appendHoverText(stack, world, tooltip, flag);

        if (KeyboardHelper.isShiftKeyDown())
        {
            tooltip.add(
                    StringHelper.formatNumber(getEnergyStored(stack))
                            .append(" / ")
                            .append(StringHelper.formatNumber(getMaxEnergyStored(stack)))
                            .append(" FE")
            );
        }
    }


    @Override
    @OnlyIn(Dist.CLIENT)
    public void fillItemCategory(ItemGroup group, NonNullList<ItemStack> items)
    {
        if (allowdedIn(group))
        {
            if (checkLoaded())
            {
                ItemStack empty = new ItemStack(this);
                TerminalHandler.setDefaultTagCompound(empty);
                items.add(empty);
                ItemStack full = new ItemStack(this);
                TerminalHandler.setDefaultTagCompound(full);
                EnergyHelper.setDefaultEnergyTag(full, getMaxEnergyStored(full));
                items.add(full);
            }
        }
    }


    @Override
    public boolean isPowered()
    {
        return true;
    }

    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, CompoundNBT nbt)
    {
        return new EnergyItemCapability<>(new EnergyStorageCapability(this, stack));
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment)
    {
        return false;
    }

    @Override
    public boolean checkLoaded()
    {
        return true;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int p_77663_4_, boolean p_77663_5_)
    {
        if(entity instanceof PlayerEntity)
        {
            if(world.isClientSide)
            {
                final Screen active = Minecraft.getInstance().screen;

                if(active instanceof InventoryScreen)
                {
                    if(world.getGameTime() % 20 == 0)
                    {
                        EnergyHelper.extractEnergy(stack, 1, false);
                    }
                }
            }
        }
    }
}
