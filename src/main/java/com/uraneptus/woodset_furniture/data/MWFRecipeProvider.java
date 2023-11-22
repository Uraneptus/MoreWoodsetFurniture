package com.uraneptus.woodset_furniture.data;

import com.mrcrayfish.furniture.core.ModBlocks;
import com.uraneptus.woodset_furniture.core.registry.MWFBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class MWFRecipeProvider extends RecipeProvider {

    public MWFRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        table(consumer, MWFBlocks.TABLE_CHERRY.get(), Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS);
        table(consumer, MWFBlocks.TABLE_STRIPPED_CHERRY.get(), Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_LOG);
        chair(consumer, MWFBlocks.CHAIR_CHERRY.get(), Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS);
        chair(consumer, MWFBlocks.CHAIR_STRIPPED_CHERRY.get(), Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_LOG);
        coffeeTable(consumer, MWFBlocks.COFFEE_TABLE_CHERRY.get(), Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS);
        coffeeTable(consumer, MWFBlocks.COFFEE_TABLE_STRIPPED_CHERRY.get(), Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_LOG);
        cabinet(consumer, MWFBlocks.CABINET_CHERRY.get(), Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS);
        cabinet(consumer, MWFBlocks.CABINET_STRIPPED_CHERRY.get(), Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_LOG);
        bedsideCabinet(consumer, MWFBlocks.BEDSIDE_CABINET_CHERRY.get(), Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS);
        bedsideCabinet(consumer, MWFBlocks.BEDSIDE_CABINET_STRIPPED_CHERRY.get(), Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_LOG);
        desk(consumer, MWFBlocks.DESK_CHERRY.get(), Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS);
        desk(consumer, MWFBlocks.DESK_STRIPPED_CHERRY.get(), Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_LOG);
        deskCabinet(consumer, MWFBlocks.DESK_CABINET_CHERRY.get(), Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS);
        deskCabinet(consumer, MWFBlocks.DESK_CABINET_STRIPPED_CHERRY.get(), Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_LOG);
        blinds(consumer, MWFBlocks.BLINDS_CHERRY.get(), Blocks.CHERRY_LOG);
        blinds(consumer, MWFBlocks.BLINDS_STRIPPED_CHERRY.get(), Blocks.STRIPPED_CHERRY_LOG);
        upgradedFence(consumer, MWFBlocks.UPGRADED_FENCE_CHERRY.get(), Blocks.CHERRY_LOG);
        upgradedFence(consumer, MWFBlocks.UPGRADED_FENCE_STRIPPED_CHERRY.get(), Blocks.STRIPPED_CHERRY_LOG);
        upgradedGate(consumer, MWFBlocks.UPGRADED_GATE_CHERRY.get(), Blocks.CHERRY_LOG);
        upgradedGate(consumer, MWFBlocks.UPGRADED_GATE_STRIPPED_CHERRY.get(), Blocks.STRIPPED_CHERRY_LOG);
        crate(consumer, MWFBlocks.CRATE_CHERRY.get(), Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS);
        crate(consumer, MWFBlocks.CRATE_STRIPPED_CHERRY.get(), Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_LOG);
        parkBench(consumer, MWFBlocks.PARK_BENCH_CHERRY.get(), Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS);
        parkBench(consumer, MWFBlocks.PARK_BENCH_STRIPPED_CHERRY.get(), Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_LOG);
        kitchenCounter(consumer, MWFBlocks.KITCHEN_COUNTER_CHERRY.get(), Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS);
        kitchenCounter(consumer, MWFBlocks.KITCHEN_COUNTER_STRIPPED_CHERRY.get(), Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_LOG);
        kitchenDrawer(consumer, MWFBlocks.KITCHEN_DRAWER_CHERRY.get(), Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS);
        kitchenDrawer(consumer, MWFBlocks.KITCHEN_DRAWER_STRIPPED_CHERRY.get(), Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_LOG);
        kitchenSink(consumer, MWFBlocks.KITCHEN_SINK_LIGHT_CHERRY.get(), Blocks.WHITE_CONCRETE, Blocks.CHERRY_PLANKS);
        kitchenSink(consumer, MWFBlocks.KITCHEN_SINK_DARK_CHERRY.get(), Blocks.GRAY_CONCRETE, Blocks.CHERRY_PLANKS);
        kitchenSink(consumer, MWFBlocks.KITCHEN_SINK_LIGHT_STRIPPED_CHERRY.get(), Blocks.WHITE_CONCRETE, Blocks.STRIPPED_CHERRY_LOG);
        kitchenSink(consumer, MWFBlocks.KITCHEN_SINK_DARK_STRIPPED_CHERRY.get(), Blocks.GRAY_CONCRETE, Blocks.STRIPPED_CHERRY_LOG);
        mailBox(consumer, MWFBlocks.MAIL_BOX_CHERRY.get(), MWFBlocks.UPGRADED_FENCE_CHERRY.get());
        mailBox(consumer, MWFBlocks.MAIL_BOX_STRIPPED_CHERRY.get(), MWFBlocks.UPGRADED_FENCE_STRIPPED_CHERRY.get());
        hedge(consumer, MWFBlocks.HEDGE_CHERRY.get(), Blocks.CHERRY_LEAVES);
    }

    private static void table(Consumer<FinishedRecipe> recipeConsumer, ItemLike table, ItemLike log, ItemLike planks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, table, 4).pattern("LLL").pattern(" P ").pattern(" P ").define('L', log).define('P', planks).group("table").unlockedBy("has_log", has(log)).unlockedBy("has_planks", has(planks)).save(recipeConsumer);
    }

    private static void chair(Consumer<FinishedRecipe> recipeConsumer, ItemLike chair, ItemLike log, ItemLike planks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, chair, 4).pattern("L  ").pattern("LLL").pattern("P P").define('L', log).define('P', planks).group("chair").unlockedBy("has_log", has(log)).unlockedBy("has_planks", has(planks)).save(recipeConsumer);
    }

    private static void coffeeTable(Consumer<FinishedRecipe> recipeConsumer, ItemLike table, ItemLike log, ItemLike planks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, table, 4).pattern("LLL").pattern("P P").define('L', log).define('P', planks).group("coffee_table").unlockedBy("has_log", has(log)).unlockedBy("has_planks", has(planks)).save(recipeConsumer);
    }

    private static void cabinet(Consumer<FinishedRecipe> recipeConsumer, ItemLike cabinet, ItemLike log, ItemLike planks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, cabinet, 2).pattern("PPL").pattern("P L").pattern("PPL").define('L', log).define('P', planks).group("cabinet").unlockedBy("has_log", has(log)).unlockedBy("has_planks", has(planks)).save(recipeConsumer);
    }

    private static void bedsideCabinet(Consumer<FinishedRecipe> recipeConsumer, ItemLike cabinet, ItemLike log, ItemLike planks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, cabinet, 2).pattern("LLL").pattern("P P").pattern("PPP").define('L', log).define('P', planks).group("bedside_cabinet").unlockedBy("has_log", has(log)).unlockedBy("has_planks", has(planks)).save(recipeConsumer);
    }

    private static void desk(Consumer<FinishedRecipe> recipeConsumer, ItemLike desk, ItemLike log, ItemLike planks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, desk, 2).pattern("LLL").pattern("P P").pattern("P P").define('L', log).define('P', planks).group("desk").unlockedBy("has_log", has(log)).unlockedBy("has_planks", has(planks)).save(recipeConsumer);
    }

    private static void deskCabinet(Consumer<FinishedRecipe> recipeConsumer, ItemLike desk, ItemLike log, ItemLike planks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, desk, 2).pattern("LLL").pattern("PPP").pattern("P P").define('L', log).define('P', planks).group("desk_cabinet").unlockedBy("has_log", has(log)).unlockedBy("has_planks", has(planks)).save(recipeConsumer);
    }

    private static void blinds(Consumer<FinishedRecipe> recipeConsumer, ItemLike blinds, ItemLike log) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, blinds, 2).pattern("LLL").pattern("SSS").pattern("SSS").define('L', log).define('S', Tags.Items.RODS_WOODEN).group("blinds").unlockedBy("has_log", has(log)).save(recipeConsumer);
    }

    private static void upgradedFence(Consumer<FinishedRecipe> recipeConsumer, ItemLike fence, ItemLike log) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, fence, 12).pattern("LSL").pattern("LSL").define('L', log).define('S', Tags.Items.RODS_WOODEN).group("upgraded_fence").unlockedBy("has_log", has(log)).save(recipeConsumer);
    }

    private static void upgradedGate(Consumer<FinishedRecipe> recipeConsumer, ItemLike gate, ItemLike log) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, gate, 2).pattern("LGL").define('L', log).define('G', Tags.Items.FENCE_GATES_WOODEN).group("upgraded_gate").unlockedBy("has_log", has(log)).unlockedBy("has_gate", has(Tags.Items.FENCE_GATES_WOODEN)).save(recipeConsumer);
    }

    private static void crate(Consumer<FinishedRecipe> recipeConsumer, ItemLike crate, ItemLike log, ItemLike planks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, crate, 2).pattern("LPL").pattern("P P").pattern("LPL").define('L', log).define('P', planks).group("crate").unlockedBy("has_log", has(log)).unlockedBy("has_planks", has(planks)).save(recipeConsumer);
    }

    private static void parkBench(Consumer<FinishedRecipe> recipeConsumer, ItemLike bench, ItemLike log, ItemLike planks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, bench, 4).pattern("PPP").pattern("PPP").pattern("L L").define('L', log).define('P', planks).group("park_bench").unlockedBy("has_log", has(log)).unlockedBy("has_planks", has(planks)).save(recipeConsumer);
    }

    private static void mailBox(Consumer<FinishedRecipe> recipeConsumer, ItemLike mailbox, ItemLike fence) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, mailbox).pattern("C").pattern("F").pattern("F").define('C', Tags.Items.CHESTS_WOODEN).define('F', fence).group("mail_box").unlockedBy("has_postbox", has((ItemLike) ModBlocks.POST_BOX.get())).unlockedBy("has_chest", has(Tags.Items.CHESTS_WOODEN)).save(recipeConsumer);
    }

    private static void hedge(Consumer<FinishedRecipe> recipeConsumer, ItemLike hedge, ItemLike leaves) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, hedge, 12).pattern("LLL").pattern("LLL").define('L', leaves).group("hedge").unlockedBy("has_leaves", has(leaves)).save(recipeConsumer);
    }

    private static void kitchenCounter(Consumer<FinishedRecipe> recipeConsumer, ItemLike counter, ItemLike log, ItemLike planks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, counter, 8).pattern("LLL").pattern("PPP").pattern("PPP").define('L', log).define('P', planks).group("kitchen_counter").unlockedBy("has_log", has(log)).unlockedBy("has_planks", has(planks)).save(recipeConsumer);
    }

    private static void kitchenDrawer(Consumer<FinishedRecipe> recipeConsumer, ItemLike counter, ItemLike log, ItemLike planks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, counter, 4).pattern("LLL").pattern("PCP").pattern("PPP").define('L', log).define('P', planks).define('C', Tags.Items.CHESTS_WOODEN).group("kitchen_drawer").unlockedBy("has_log", has(log)).unlockedBy("has_planks", has(planks)).unlockedBy("has_chest", has(Tags.Items.CHESTS_WOODEN)).save(recipeConsumer);
    }

    private static void kitchenSink(Consumer<FinishedRecipe> recipeConsumer, ItemLike sink, ItemLike top, ItemLike bottom) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, sink, 2).pattern("CIC").pattern("PBP").pattern("PPP").define('C', top).define('I', Tags.Items.INGOTS_IRON).define('P', bottom).define('B', net.minecraft.world.item.Items.BUCKET).group("kitchen_sink").unlockedBy("has_top", has(top)).unlockedBy("has_bottom", has(bottom)).unlockedBy("has_bucket", has(net.minecraft.world.item.Items.BUCKET)).save(recipeConsumer);
    }
}
