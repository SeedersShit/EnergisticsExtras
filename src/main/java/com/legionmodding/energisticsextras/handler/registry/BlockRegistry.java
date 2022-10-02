package com.legionmodding.energisticsextras.handler.registry;

import com.legionmodding.energisticsextras.block.*;
import com.legionmodding.energisticsextras.util.Reference;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry
{
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);
    public static final RegistryObject<Block> CERTUS_TANK = BLOCKS.register("certus_tank", BlockCertusTank::new);
    public static final RegistryObject<Block> ENCODER = BLOCKS.register("encoder", BlockEncoder::new);
    public static final RegistryObject<Block> FLUID_CRAFTER = BLOCKS.register("fluid_crafter", BlockFluidCrafter::new);
    public static final RegistryObject<Block> FLUID_FILLER = BLOCKS.register("fluid_filler", BlockFluidFiller::new);
    public static final RegistryObject<Block> FLUID_INTERFACE = BLOCKS.register("fluid_interface", BlockFluidInterface::new);
    public static final RegistryObject<Block> GROWER = BLOCKS.register("grower", BlockGrower::new);
    public static final RegistryObject<Block> HARD_ME_DRIVE = BLOCKS.register("hard_me_drive", BlockHardMEDrive::new);
    public static final RegistryObject<Block> INSCRIBER = BLOCKS.register("inscriber", BlockInscriber::new);
    public static final RegistryObject<Block> VIBRATION_CHAMBER_FLUID = BLOCKS.register("vibration_chamber_fluid", BlockVibrationChamberFluid::new);
    public static final RegistryObject<Block> WALRUS = BLOCKS.register("walrus", BlockWalrus::new);
    public static final RegistryObject<Block> WIRELESS = BLOCKS.register("wireless", BlockWireless::new);

    public static void registerBlocks()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
