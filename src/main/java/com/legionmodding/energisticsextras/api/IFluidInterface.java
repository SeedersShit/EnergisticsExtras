package com.legionmodding.energisticsextras.api;

import appeng.api.util.AEPartLocation;

import net.minecraft.fluid.Fluid;
import net.minecraft.inventory.IInventory;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidTank;

public interface IFluidInterface
{

    Fluid getFilter(AEPartLocation side);

    IFluidTank getFluidTank(AEPartLocation side);

    IInventory getPatternInventory();

    void setFilter(AEPartLocation side, Fluid fluid);

    void setFluidTank(AEPartLocation side, FluidStack fluid);

}
