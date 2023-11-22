package com.uraneptus.woodset_furniture.data;

import com.mrcrayfish.furniture.block.CoffeeTableBlock;
import com.uraneptus.woodset_furniture.core.registry.MWFBlocks;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class MWFLootProvider extends LootTableProvider {

    public MWFLootProvider(PackOutput pOutput) {
        super(pOutput, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(BlockLoot::new, LootContextParamSets.BLOCK)));
    }

    public static class BlockLoot extends BlockLootSubProvider {

        protected BlockLoot() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return MWFBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
        }

        @Override
        protected void generate() {
            for (Block block : MWFBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).toList()) {
                if (!(block instanceof CoffeeTableBlock)) {
                    this.dropSelf(block);
                } else {
                    registerCoffeeTable(block);
                }
            }
        }

        public void registerCoffeeTable(Block block) {
            this.add(block, (coffeeTable) -> LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(this.applyExplosionCondition(block, LootItem.lootTableItem(coffeeTable).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(coffeeTable).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CoffeeTableBlock.TALL, true))))))));
        }
    }
}
