package com.uraneptus.woodset_furniture;

import com.uraneptus.woodset_furniture.core.registry.MWFBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(MoreWoodsetFurniture.MODID)
public class MoreWoodsetFurniture {
    public static final String MODID = "woodset_furniture";


    public MoreWoodsetFurniture() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        MWFBlocks.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
