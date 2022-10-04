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
    public static final RegistryObject<Block> ENERGY_CELL_FIXTURE = BLOCKS.register("energy_cell_fixture", BlockFixture::new);
    public static final RegistryObject<Block> FLUID_CRAFTER = BLOCKS.register("fluid_crafter", BlockFluidCrafter::new);
    public static final RegistryObject<Block> FLUID_FILLER = BLOCKS.register("fluid_filler", BlockFluidFiller::new);
    public static final RegistryObject<Block> GROWER = BLOCKS.register("grower", BlockGrower::new);
    public static final RegistryObject<Block> HARD_ME_DRIVE = BLOCKS.register("hard_me_drive", BlockHardMEDrive::new);
    public static final RegistryObject<Block> INSCRIBER = BLOCKS.register("inscriber", BlockInscriber::new);
    //TODO Separate and create classes, this is all just temporary
    public static final RegistryObject<Block> ME_DRIVE_FIXTURE = BLOCKS.register("me_drive_fixture", BlockFixture::new);
    public static final RegistryObject<Block> ME_FLUID_CONVERSION_MONITOR = BLOCKS.register("me_fluid_conversion_monitor", BlockConversionMonitor::new);
    public static final RegistryObject<Block> ME_FLUID_STORAGE_MONITOR = BLOCKS.register("me_fluid_storage_monitor", BlockStorageMonitor::new);
    public static final RegistryObject<Block> ME_GAS_ANNIHILATION_PLANE = BLOCKS.register("me_gas_annihilation_plane", BlockAnnihilationPlane::new);
    public static final RegistryObject<Block> ME_GAS_CONVERSION_MONITOR = BLOCKS.register("me_gas_conversion_monitor", BlockConversionMonitor::new);
    public static final RegistryObject<Block> ME_GAS_FORMATION_PLANE = BLOCKS.register("me_gas_formation_plane", BlockFormationPlane::new);
    public static final RegistryObject<Block> ME_GAS_EXPORT_BUS = BLOCKS.register("me_gas_export_bus", BlockExportBus::new);
    public static final RegistryObject<Block> ME_GAS_IMPORT_BUS = BLOCKS.register("me_gas_import_bus", BlockImportBus::new);
    public static final RegistryObject<Block> ME_GAS_INTERFACE = BLOCKS.register("me_gas_interface", BlockInterface::new);
    public static final RegistryObject<Block> ME_GAS_LEVEL_EMITTER = BLOCKS.register("me_gas_level_emitter", BlockLevelEmitter::new);
    public static final RegistryObject<Block> ME_GAS_STORAGE_BUS = BLOCKS.register("me_gas_storage_bus", BlockStorageBus::new);
    public static final RegistryObject<Block> ME_GAS_STORAGE_MONITOR = BLOCKS.register("me_gas_storage_monitor", BlockStorageMonitor::new);
    public static final RegistryObject<Block> ME_GAS_TERMINAL = BLOCKS.register("me_gas_terminal", BlockTerminal::new);
    public static final RegistryObject<Block> ME_ORE_DICTIONARY_EXPORT_BUS = BLOCKS.register("me_ore_dictionary_export_bus", BlockExportBus::new);
    public static final RegistryObject<Block> ME_ORE_DICTIONARY_IMPORT_BUS = BLOCKS.register("me_ore_dictionary_import_bus", BlockImportBus::new);;
    public static final RegistryObject<Block> VIBRATION_CHAMBER_FLUID = BLOCKS.register("vibration_chamber_fluid", BlockVibrationChamberFluid::new);
    public static final RegistryObject<Block> WALRUS = BLOCKS.register("walrus", BlockWalrus::new);
    public static final RegistryObject<Block> WIRELESS = BLOCKS.register("wireless", BlockWireless::new);

    public static void registerBlocks()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
