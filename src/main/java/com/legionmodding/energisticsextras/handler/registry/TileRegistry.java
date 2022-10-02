package com.legionmodding.energisticsextras.handler.registry;

import com.legionmodding.energisticsextras.tile.*;
import com.legionmodding.energisticsextras.util.Reference;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileRegistry
{
    private static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Reference.MOD_ID);
    public static final RegistryObject<TileEntityType<TileCertusTank>> CERTUS_TANK = TILE_ENTITIES.register("certus_tank", () -> TileEntityType.Builder.of(TileCertusTank::new, BlockRegistry.CERTUS_TANK.get()).build(null));

    public static void registerTiles()
    {
        TILE_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
