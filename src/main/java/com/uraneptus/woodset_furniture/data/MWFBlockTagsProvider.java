package com.uraneptus.woodset_furniture.data;

import com.mrcrayfish.furniture.block.HedgeBlock;
import com.mrcrayfish.furniture.block.UpgradedFenceBlock;
import com.mrcrayfish.furniture.block.UpgradedGateBlock;
import com.mrcrayfish.furniture.common.ModTags;
import com.uraneptus.woodset_furniture.MoreWoodsetFurniture;
import com.uraneptus.woodset_furniture.core.registry.MWFBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class MWFBlockTagsProvider extends BlockTagsProvider {

    public MWFBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MoreWoodsetFurniture.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        for (Block block : MWFBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).toList()) {
            if (!(block instanceof HedgeBlock)) {
                tag(BlockTags.MINEABLE_WITH_AXE).add(block);
            }
            if (block instanceof UpgradedGateBlock) {
                tag(ModTags.Blocks.UPGRADED_FENCE_GATES).add(block);
            }
            if (block instanceof UpgradedFenceBlock) {
                tag(ModTags.Blocks.UPGRADED_FENCES).add(block);
            }
            if (block instanceof HedgeBlock) {
                tag(ModTags.Blocks.HEDGES).add(block);
            }
        }
    }
}
