package com.legionmodding.energisticsextras;

import com.legionmodding.energisticsextras.handler.registry.BlockRegistry;
import com.legionmodding.energisticsextras.handler.registry.ItemRegistry;
import com.legionmodding.energisticsextras.util.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class EnergisticsExtras
{
    public static final Logger LOGGER = LogManager.getLogger();

    public EnergisticsExtras()
    {
        BlockRegistry.registerBlocks();
        ItemRegistry.registerItems();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(FMLClientSetupEvent event)
    {

    }

    private void commonSetup(FMLCommonSetupEvent event)
    {

    }
}
