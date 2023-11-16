package com.uraneptus.woodset_furniture.core.registry;

import com.uraneptus.woodset_furniture.MoreWoodsetFurniture;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = MoreWoodsetFurniture.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MWFBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreWoodsetFurniture.MODID);


}
