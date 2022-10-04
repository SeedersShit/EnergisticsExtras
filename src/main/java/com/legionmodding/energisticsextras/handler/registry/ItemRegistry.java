package com.legionmodding.energisticsextras.handler.registry;

import com.legionmodding.energisticsextras.item.*;
import com.legionmodding.energisticsextras.item.components.ItemComponentBase;
import com.legionmodding.energisticsextras.item.storage.item.ItemStorageBase;
import com.legionmodding.energisticsextras.util.Reference;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
@SuppressWarnings("unused")
public class ItemRegistry
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    /* Items */

    private static final RegistryObject<Item> ADVANCED_STORAGE_HOUSING = ITEMS.register("advanced_storage_housing", ItemNetwork::new);
    private static final RegistryObject<Item> FLUID_STORAGE_HOUSING = ITEMS.register("fluid_storage_housing", ItemNetwork::new);
    private static final RegistryObject<Item> GAS_STORAGE_HOUSING = ITEMS.register("gas_storage_housing", ItemNetwork::new);
    private static final RegistryObject<Item> ME_BLOCK_CONTAINER = ITEMS.register("me_block_container", ItemNetwork::new);
    private static final RegistryObject<Item> ME_FLUID_PATTERN = ITEMS.register("me_fluid_pattern", ItemNetwork::new);
    private static final RegistryObject<Item> ME_GAS_PATTERN = ITEMS.register("me_gas_pattern", ItemNetwork::new);
    private static final RegistryObject<Item> ME_WIRELESS_TERMINAL = ITEMS.register("me_wireless_terminal", ItemNetwork::new);
    private static final RegistryObject<Item> ME_WIRELESS_TERMINAL_FLUID = ITEMS.register("me_wireless_terminal_fluid", ItemNetwork::new);
    private static final RegistryObject<Item> ME_WIRELESS_TERMINAL_GAS = ITEMS.register("me_wireless_terminal_gas", ItemNetwork::new);
    private static final RegistryObject<Item> ME_WIRELESS_TERMINAL_UNIVERSAL = ITEMS.register("me_wireless_terminal_universal", ItemNetwork::new);
    private static final RegistryObject<Item> ME_PORTABLE_FLUID_STORAGE = ITEMS.register("me_portable_fluid_storage", ItemNetwork::new);
    private static final RegistryObject<Item> ME_PORTABLE_GAS_STORAGE = ITEMS.register("me_portable_gas_storage", ItemNetwork::new);
    private static final RegistryObject<Item> NETWORK_TOOL = ITEMS.register("network_visualisation_tool", ItemNetwork::new);
    public static final RegistryObject<Item> WIRELESS_KIT = ITEMS.register("wireless_setup_kit", ItemWireless::new);


    /* Storage Components */
    private static final RegistryObject<Item> ONE_STORAGE_COMPONENT_GAS = ITEMS.register("1k_storage_component_gas", ItemComponentBase::new);
    private static final RegistryObject<Item> TWO_FIFTY_SIX_STORAGE_COMPONENT = ITEMS.register("256k_storage_component", ItemComponentBase::new);
    private static final RegistryObject<Item> TWO_FIFTY_SIX_STORAGE_COMPONENT_FLUID = ITEMS.register("256k_storage_component_fluid", ItemComponentBase::new);
    private static final RegistryObject<Item> TWO_FIFTY_SIX_STORAGE_COMPONENT_GAS = ITEMS.register("256k_storage_component_gas", ItemComponentBase::new);
    private static final RegistryObject<Item> FOUR_STORAGE_COMPONENT_GAS = ITEMS.register("4k_storage_component_gas", ItemComponentBase::new);
    private static final RegistryObject<Item> ONE_TWENTY_FOUR_STORAGE_COMPONENT = ITEMS.register("1024k_storage_component", ItemComponentBase::new);
    private static final RegistryObject<Item> ONE_TWENTY_FOUR_STORAGE_COMPONENT_FLUID = ITEMS.register("1024k_storage_component_fluid", ItemComponentBase::new);
    private static final RegistryObject<Item> ONE_TWENTY_FOUR_STORAGE_COMPONENT_GAS = ITEMS.register("1024_storage_component_gas", ItemComponentBase::new);
    private static final RegistryObject<Item> FOUR_NINETY_SIX_STORAGE_COMPONENT = ITEMS.register("4096k_storage_component", ItemComponentBase::new);
    private static final RegistryObject<Item> FOUR_NINETY_SIX_STORAGE_COMPONENT_FLUID = ITEMS.register("4096k_storage_component_fluid", ItemComponentBase::new);
    private static final RegistryObject<Item> FOUR_NINETY_SIX_STORAGE_COMPONENT_GAS = ITEMS.register("4096k_storage_component_gas", ItemComponentBase::new);
    private static final RegistryObject<Item> SIXTEEN_STORAGE_COMPONENT_GAS = ITEMS.register("16k_storage_component_gas", ItemComponentBase::new);
    private static final RegistryObject<Item> SIXTY_FOUR_STORAGE_COMPONENT_GAS = ITEMS.register("64k_storage_component_gas", ItemComponentBase::new);
    private static final RegistryObject<Item> SIXTEEN_THREE_EIGHT_FOUR_STORAGE_COMPONENT = ITEMS.register("16384k_storage_component", ItemComponentBase::new);
    private static final RegistryObject<Item> SIXTEEN_THREE_EIGHT_FOUR_STORAGE_COMPONENT_FLUID = ITEMS.register("16384k_storage_component_fluid", ItemComponentBase::new);
    private static final RegistryObject<Item> SIXTEEN_THREE_EIGHT_FOUR_STORAGE_COMPONENT_GAS = ITEMS.register("16384k_storage_component_gas", ItemComponentBase::new);

    /* Storage Cells */

    private static final RegistryObject<Item> TWO_FIFTY_SIX_STORAGE_CELL = ITEMS.register("256k_storage_cell", ItemStorageBase::new);
    private static final RegistryObject<Item> TWO_FIFTY_SIX_STORAGE_CELL_FLUID = ITEMS.register("256k_storage_cell_fluid", ItemStorageBase::new);
    private static final RegistryObject<Item> TWO_FIFTY_SIX_STORAGE_CELL_GAS = ITEMS.register("256k_storage_cell_gas", ItemStorageBase::new);
    private static final RegistryObject<Item> ONE_TWENTY_FOUR_STORAGE_CELL = ITEMS.register("1024k_storage_cell", ItemStorageBase::new);
    private static final RegistryObject<Item> ONE_TWENTY_FOUR_STORAGE_CELL_FLUID = ITEMS.register("1024k_storage_cell_fluid", ItemStorageBase::new);
    private static final RegistryObject<Item> ONE_TWENTY_FOUR_STORAGE_CELL_GAS = ITEMS.register("1024k_storage_cell_gas", ItemStorageBase::new);
    private static final RegistryObject<Item> FOUR_NINETY_SIX_STORAGE_CELL = ITEMS.register("4096k_storage_cell", ItemStorageBase::new);
    private static final RegistryObject<Item> FOUR_NINETY_SIX_STORAGE_CELL_FLUID = ITEMS.register("4096k_storage_cell_fluid", ItemStorageBase::new);
    private static final RegistryObject<Item> FOUR_NINETY_SIX_STORAGE_CELL_GAS = ITEMS.register("4096k_storage_cell_gas", ItemStorageBase::new);
    private static final RegistryObject<Item> SIXTEEN_THREE_EIGHT_FOUR_STORAGE_CELL = ITEMS.register("16384k_storage_cell", ItemStorageBase::new);
    private static final RegistryObject<Item> SIXTEEN_THREE_EIGHT_FOUR_STORAGE_CELL_FLUID = ITEMS.register("16384k_storage_cell_fluid", ItemStorageBase::new);
    private static final RegistryObject<Item> SIXTEEN_THREE_EIGHT_FOUR_STORAGE_CELL_GAS = ITEMS.register("16384k_storage_cell_gas", ItemStorageBase::new);

    /* Block Items */

    private static final RegistryObject<Item> CERTUS_TANK = ITEMS.register("certus_tank", () -> new BlockItem(BlockRegistry.CERTUS_TANK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ENCODER = ITEMS.register("encoder", () -> new BlockItem(BlockRegistry.ENCODER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ENERGY_CELL_FIXTURE = ITEMS.register("energy_cell_fixture", () -> new BlockItem(BlockRegistry.ENERGY_CELL_FIXTURE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> FLUID_CRAFTER = ITEMS.register("fluid_crafter", () -> new BlockItem(BlockRegistry.FLUID_CRAFTER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> FLUID_FILLER = ITEMS.register("fluid_filler", () -> new BlockItem(BlockRegistry.FLUID_FILLER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> GROWER = ITEMS.register("grower", () -> new BlockItem(BlockRegistry.GROWER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> HARD_ME_DRIVE = ITEMS.register("hard_me_drive", () -> new BlockItem(BlockRegistry.HARD_ME_DRIVE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> INSCRIBER = ITEMS.register("inscriber", () -> new BlockItem(BlockRegistry.INSCRIBER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_DRIVE_FIXTURE = ITEMS.register("me_drive_fixture", () -> new BlockItem(BlockRegistry.ME_DRIVE_FIXTURE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_FLUID_CONVERSION_MONITOR = ITEMS.register("me_fluid_conversion_monitor", () -> new BlockItem(BlockRegistry.ME_FLUID_CONVERSION_MONITOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_FLUID_STORAGE_MONITOR = ITEMS.register("me_fluid_storage_monitor", () -> new BlockItem(BlockRegistry.ME_FLUID_STORAGE_MONITOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_GAS_ANNIHILATION_PLANE = ITEMS.register("me_gas_annihilation_plane", () -> new BlockItem(BlockRegistry.ME_GAS_ANNIHILATION_PLANE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_GAS_CONVERSION_MONITOR = ITEMS.register("me_gas_conversion_monitor", () -> new BlockItem(BlockRegistry.ME_GAS_CONVERSION_MONITOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_GAS_FORMATION_PLANE = ITEMS.register("me_gas_formation_plane", () -> new BlockItem(BlockRegistry.ME_GAS_FORMATION_PLANE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_GAS_EXPORT_BUS = ITEMS.register("me_gas_export_bus", () -> new BlockItem(BlockRegistry.ME_GAS_EXPORT_BUS.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_GAS_IMPORT_BUS = ITEMS.register("me_gas_import_bus", () -> new BlockItem(BlockRegistry.ME_GAS_IMPORT_BUS.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_GAS_INTERFACE = ITEMS.register("me_gas_interface", () -> new BlockItem(BlockRegistry.ME_GAS_INTERFACE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_GAS_LEVEL_EMITTER = ITEMS.register("me_gas_level_emitter", () -> new BlockItem(BlockRegistry.ME_GAS_LEVEL_EMITTER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_GAS_STORAGE_BUS = ITEMS.register("me_gas_storage_bus", () -> new BlockItem(BlockRegistry.ME_GAS_STORAGE_BUS.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_GAS_STORAGE_MONITOR = ITEMS.register("me_gas_storage_monitor", () -> new BlockItem(BlockRegistry.ME_GAS_STORAGE_MONITOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_GAS_TERMINAL = ITEMS.register("me_gas_terminal", () -> new BlockItem(BlockRegistry.ME_GAS_TERMINAL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_ORE_DICTIONARY_EXPORT_BUS = ITEMS.register("me_ore_dictionary_export_bus", () -> new BlockItem(BlockRegistry.ME_ORE_DICTIONARY_EXPORT_BUS.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ME_ORE_DICTIONARY_IMPORT_BUS = ITEMS.register("me_ore_dictionary_import_bus", () -> new BlockItem(BlockRegistry.ME_ORE_DICTIONARY_IMPORT_BUS.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> VIBRATION_CHAMBER_FLUID = ITEMS.register("vibration_chamber_fluid", () -> new BlockItem(BlockRegistry.VIBRATION_CHAMBER_FLUID.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> WALRUS = ITEMS.register("walrus", () -> new BlockItem(BlockRegistry.WALRUS.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> WIRELESS = ITEMS.register("wireless", () -> new BlockItem(BlockRegistry.WIRELESS.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    //TODO Only register gas stuff if a gas mod is detected
    public static void registerItems()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
