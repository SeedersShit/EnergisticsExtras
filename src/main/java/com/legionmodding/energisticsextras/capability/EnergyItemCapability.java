package com.legionmodding.energisticsextras.capability;

import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;

import javax.annotation.Nullable;

public class EnergyItemCapability<H> implements ICapabilityProvider
{
    public IEnergyStorage instance;

    public EnergyItemCapability(IEnergyStorage instance)
    {
        this.instance = instance;
    }

    @Override
    @Nullable
    public <T> LazyOptional<T> getCapability(Capability<T> capability, Direction facing)
    {
        return CapabilityEnergy.ENERGY.orEmpty(capability, LazyOptional.of(() -> this.instance));
    }
}
