package com.uraneptus.woodset_furniture;

import com.uraneptus.woodset_furniture.core.registry.MWFBlocks;
import com.uraneptus.woodset_furniture.data.MWFBlockTagsProvider;
import com.uraneptus.woodset_furniture.data.MWFItemTagsProvider;
import com.uraneptus.woodset_furniture.data.MWFLangProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.concurrent.CompletableFuture;

@Mod(MoreWoodsetFurniture.MODID)
@Mod.EventBusSubscriber(modid = MoreWoodsetFurniture.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreWoodsetFurniture {
    public static final String MODID = "woodset_furniture";


    public MoreWoodsetFurniture() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::gatherData);

        MWFBlocks.BLOCKS.register(bus);
        MWFBlocks.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void gatherData(GatherDataEvent event) {
        boolean includeClient = event.includeClient();
        boolean includeServer = event.includeServer();
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(includeClient, new MWFLangProvider(packOutput));
        MWFBlockTagsProvider blockTagsProvider = new MWFBlockTagsProvider(packOutput, lookupProvider, fileHelper);
        generator.addProvider(includeServer, blockTagsProvider);
        generator.addProvider(includeServer, new MWFItemTagsProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), fileHelper));
    }

}
