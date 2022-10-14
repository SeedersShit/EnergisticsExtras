package com.legionmodding.energisticsextras.api;

import appeng.api.networking.security.IActionSource;
import appeng.api.storage.data.IAEFluidStack;

import com.legionmodding.energisticsextras.api.definitions.*;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidStack;

public interface EnergisticsExtrasApi
{
    void addFluidToShowBlacklist(Class<? extends Fluid> clazz);

    void addFluidToShowBlacklist(Fluid fluid);

    void addFluidToStorageBlacklist(Class<? extends Fluid> clazz);

    void addFluidToStorageBlacklist(Fluid fluid);

    IBlockDefinition blocks();

    boolean canFluidSeeInTerminal(Fluid fluid);

    boolean canStoreFluid(Fluid fluid);

    String getVersion();

    IWirelessGasFluidTermHandler getWirelessTermHandler(ItemStack is);

    boolean isWirelessFluidTerminal(ItemStack is);

    IItemDefinition items();

    ItemStack openPortableGasCellGui(PlayerEntity player, Hand hand, World world);

    ItemStack openPortableFluidCellGui(PlayerEntity player, Hand hand, World world);

    ItemStack openWirelessFluidTerminal(PlayerEntity player, Hand hand, World world);

    ItemStack openWirelessGasTerminal(PlayerEntity player, Hand hand, World world);

    IPartDefinition parts();

    void registerWirelessTermHandler(IWirelessGasFluidTermHandler handler);

    @Deprecated
    void registerWirelessFluidTermHandler(IWirelessFluidTermHandler handler);

    /**
     * @deprecated incorrect spelling
     */
    @Deprecated
    void registryWirelessFluidTermHandler(IWirelessFluidTermHandler handler);

    void registerFuelBurnTime(Fluid fuel, int burnTime);

    boolean isGasStack(IAEFluidStack stack);

    boolean isGasStack(FluidStack stack);

    boolean isGas(Fluid fluid);

    /**
     * Converts an IAEFluid stack to a GasStack
     *
     * @param fluidStack
     * @return GasStack
     */
    Object createGasStack(IAEFluidStack fluidStack);

    /**
     * Create the fluidstack from the specific gas
     *
     * @param gasStack
     * @return FluidStack
     */
    IAEFluidStack createFluidStackFromGas(Object gasStack);

    /**
     * Create the ec fluid from the specific gas
     *
     * @param gas
     * @return Fluid
     */
    Fluid getGasFluid(Object gas);

    /**
     * A registry for StorageBus interactions
     *
     * @param esh storage handler
     */
    void addExternalStorageInterface(IExternalGasStorageHandler esh);

    /**
     * @param te       tile entity
     * @param opposite direction
     * @param mySrc    source
     * @return the handler for a given tile / forge direction
     */
    IExternalGasStorageHandler getHandler(TileEntity te, Direction opposite, IActionSource mySrc);

    boolean isGasSystemEnabled();

    void registerWrenchHandler(IWrenchHandler wrenchHandler);
}
