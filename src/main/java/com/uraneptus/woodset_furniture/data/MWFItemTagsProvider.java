package com.uraneptus.woodset_furniture.data;

import com.mrcrayfish.furniture.block.*;
import com.mrcrayfish.furniture.common.ModTags;
import com.mrcrayfish.furniture.datagen.ItemTagGen;
import com.uraneptus.woodset_furniture.MoreWoodsetFurniture;
import com.uraneptus.woodset_furniture.core.registry.MWFBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class MWFItemTagsProvider extends ItemTagsProvider {

    public MWFItemTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, MoreWoodsetFurniture.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        for (Block block : MWFBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).toList()) {
            if (block instanceof BedsideCabinetBlock || block instanceof DeskBlock || block instanceof BlindsBlock) {
                tag(ModTags.Items.BEDROOM).add(block.asItem());
            }
            if (block instanceof ChairBlock || block instanceof TableBlock || block instanceof CoffeeTableBlock) {
                tag(ModTags.Items.GENERAL).add(block.asItem());
            }
            if (block instanceof KitchenCounterBlock || block instanceof KitchenDrawerBlock || block instanceof KitchenSinkBlock) {
                tag(ModTags.Items.KITCHEN).add(block.asItem());
            }
            if (block instanceof ParkBenchBlock || block instanceof MailBoxBlock) {
                tag(ModTags.Items.OUTDOORS).add(block.asItem());
            }
            if (block instanceof CabinetBlock || block instanceof BedsideCabinetBlock || block instanceof DeskBlock || block instanceof CrateBlock || block instanceof MailBoxBlock || block instanceof KitchenDrawerBlock || block instanceof KitchenSinkBlock) {
                tag(ModTags.Items.STORAGE).add(block.asItem());
            }
            if (block instanceof UpgradedFenceBlock) {
                tag(ModTags.Items.UPGRADED_FENCES).add(block.asItem());
            }
            if (block instanceof UpgradedGateBlock) {
                tag(ModTags.Items.UPGRADED_FENCE_GATES).add(block.asItem());
            }
            if (block instanceof HedgeBlock) {
                tag(ModTags.Items.HEDGES).add(block.asItem());
            }
        }
    }
}
