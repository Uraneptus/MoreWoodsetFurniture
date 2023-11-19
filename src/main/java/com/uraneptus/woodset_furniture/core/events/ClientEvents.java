package com.uraneptus.woodset_furniture.core.events;

import com.mrcrayfish.furniture.core.ModCreativeTabs;
import com.mrcrayfish.furniture.item.CreativeItem;
import com.uraneptus.woodset_furniture.MoreWoodsetFurniture;
import com.uraneptus.woodset_furniture.core.registry.MWFBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = MoreWoodsetFurniture.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void buildTabContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            //I cannot put this in the CFM tab because that's very hardcoded
            MWFBlocks.ITEMLIST.forEach(item -> {
                event.accept(item.get());
            });
        }
    }


    public static CreativeModeTab getMCFTab() {
        return ModCreativeTabs.MAIN.get();
    }
}
