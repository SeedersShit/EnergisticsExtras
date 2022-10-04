package com.legionmodding.energisticsextras.handler.registry;

import com.legionmodding.energisticsextras.item.*;
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

    public static final RegistryObject<Item> WIRELESS_KIT = ITEMS.register("wireless_setup_kit", ItemWireless::new);
    private static final RegistryObject<Item> NETWORK_TOOL = ITEMS.register("network_visualisation_tool", ItemNetwork::new);

    /* Block Items */

    private static final RegistryObject<Item> CERTUS_TANK = ITEMS.register("certus_tank", () -> new BlockItem(BlockRegistry.CERTUS_TANK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> ENCODER = ITEMS.register("encoder", () -> new BlockItem(BlockRegistry.ENCODER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> FLUID_CRAFTER = ITEMS.register("fluid_crafter", () -> new BlockItem(BlockRegistry.FLUID_CRAFTER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> FLUID_FILLER = ITEMS.register("fluid_filler", () -> new BlockItem(BlockRegistry.FLUID_FILLER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> FLUID_INTERFACE = ITEMS.register("fluid_interface", () -> new BlockItem(BlockRegistry.FLUID_INTERFACE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> GROWER = ITEMS.register("grower", () -> new BlockItem(BlockRegistry.GROWER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> HARD_ME_DRIVE = ITEMS.register("hard_me_drive", () -> new BlockItem(BlockRegistry.HARD_ME_DRIVE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> INSCRIBER = ITEMS.register("inscriber", () -> new BlockItem(BlockRegistry.INSCRIBER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> VIBRATION_CHAMBER_FLUID = ITEMS.register("vibration_chamber_fluid", () -> new BlockItem(BlockRegistry.VIBRATION_CHAMBER_FLUID.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> WALRUS = ITEMS.register("walrus", () -> new BlockItem(BlockRegistry.WALRUS.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    private static final RegistryObject<Item> WIRELESS = ITEMS.register("wireless", () -> new BlockItem(BlockRegistry.WIRELESS.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));

    public static void registerItems()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
