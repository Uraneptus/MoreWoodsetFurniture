package com.uraneptus.woodset_furniture.core.registry;

import com.mrcrayfish.furniture.block.*;
import com.uraneptus.woodset_furniture.MoreWoodsetFurniture;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.compress.utils.Lists;

import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = MoreWoodsetFurniture.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MWFBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreWoodsetFurniture.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreWoodsetFurniture.MODID);
    public static List<RegistryObject<Item>> ITEMLIST = Lists.newArrayList();

    //CHERRY
    public static final RegistryObject<Block> TABLE_CHERRY = register("cherry_table", () -> new TableBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TABLE_STRIPPED_CHERRY = register("stripped_cherry_table", () -> new TableBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> CHAIR_CHERRY = register("cherry_chair", () -> new ChairBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> CHAIR_STRIPPED_CHERRY = register("stripped_cherry_chair", () -> new ChairBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> COFFEE_TABLE_CHERRY = register("cherry_coffee_table", () -> new CoffeeTableBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> COFFEE_TABLE_STRIPPED_CHERRY = register("stripped_cherry_coffee_table", () -> new CoffeeTableBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> CABINET_CHERRY = register("cherry_cabinet", () -> new CabinetBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> CABINET_STRIPPED_CHERRY = register("stripped_cherry_cabinet", () -> new CabinetBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> BEDSIDE_CABINET_CHERRY = register("cherry_bedside_cabinet", () -> new BedsideCabinetBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> BEDSIDE_CABINET_STRIPPED_CHERRY = register("stripped_cherry_bedside_cabinet", () -> new BedsideCabinetBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> DESK_CHERRY = register("cherry_desk", () -> new DeskBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS), DeskBlock.MaterialType.OAK));
    public static final RegistryObject<Block> DESK_STRIPPED_CHERRY = register("stripped_cherry_desk", () -> new DeskBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS), DeskBlock.MaterialType.STRIPPED_OAK));
    public static final RegistryObject<Block> DESK_CABINET_CHERRY = register("cherry_desk_cabinet", () -> new DeskCabinetBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS), DeskBlock.MaterialType.OAK));
    public static final RegistryObject<Block> DESK_CABINET_STRIPPED_CHERRY = register("stripped_cherry_desk_cabinet", () -> new DeskCabinetBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS), DeskBlock.MaterialType.STRIPPED_OAK));
    public static final RegistryObject<Block> BLINDS_CHERRY = register("cherry_blinds", () -> new BlindsBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> BLINDS_STRIPPED_CHERRY = register("stripped_cherry_blinds", () -> new BlindsBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> UPGRADED_FENCE_CHERRY = register("cherry_upgraded_fence", () -> new UpgradedFenceBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> UPGRADED_FENCE_STRIPPED_CHERRY = register("stripped_cherry_upgraded_fence", () -> new UpgradedFenceBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> UPGRADED_GATE_CHERRY = register("cherry_upgraded_gate", () -> new UpgradedGateBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> UPGRADED_GATE_STRIPPED_CHERRY = register("stripped_cherry_upgraded_gate", () -> new UpgradedGateBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> CRATE_CHERRY = register("cherry_crate", () -> new CrateBlock(Block.Properties.copy(Blocks.CHEST)));
    public static final RegistryObject<Block> CRATE_STRIPPED_CHERRY = register("stripped_cherry_crate", () -> new CrateBlock(Block.Properties.copy(Blocks.CHEST)));
    public static final RegistryObject<Block> PARK_BENCH_CHERRY = register("cherry_park_bench", () -> new ParkBenchBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> PARK_BENCH_STRIPPED_CHERRY = register("stripped_cherry_park_bench", () -> new ParkBenchBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> MAIL_BOX_CHERRY = register("cherry_mail_box", () -> new MailBoxBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> MAIL_BOX_STRIPPED_CHERRY = register("stripped_cherry_mail_box", () -> new MailBoxBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> HEDGE_CHERRY = register("cherry_hedge", () -> new HedgeBlock(Block.Properties.copy(Blocks.CHERRY_LEAVES)));
    public static final RegistryObject<Block> KITCHEN_COUNTER_CHERRY = register("cherry_kitchen_counter", () -> new KitchenCounterBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> KITCHEN_COUNTER_STRIPPED_CHERRY = register("stripped_cherry_kitchen_counter", () -> new KitchenCounterBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> KITCHEN_DRAWER_CHERRY = register("cherry_kitchen_drawer", () -> new KitchenDrawerBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> KITCHEN_DRAWER_STRIPPED_CHERRY = register("stripped_cherry_kitchen_drawer", () -> new KitchenDrawerBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> KITCHEN_SINK_LIGHT_CHERRY = register("cherry_kitchen_sink_light", () -> new KitchenSinkBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS), true));
    public static final RegistryObject<Block> KITCHEN_SINK_LIGHT_STRIPPED_CHERRY = register("stripped_cherry_kitchen_sink_light", () -> new KitchenSinkBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS), true));
    public static final RegistryObject<Block> KITCHEN_SINK_DARK_CHERRY = register("cherry_kitchen_sink_dark", () -> new KitchenSinkBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS), true));
    public static final RegistryObject<Block> KITCHEN_SINK_DARK_STRIPPED_CHERRY = register("stripped_cherry_kitchen_sink_dark", () -> new KitchenSinkBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS), true));

    //BAMBOO
    public static final RegistryObject<Block> TABLE_BAMBOO = register("bamboo_table", () -> new TableBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> TABLE_STRIPPED_BAMBOO = register("stripped_bamboo_table", () -> new TableBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> CHAIR_BAMBOO = register("bamboo_chair", () -> new ChairBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> CHAIR_STRIPPED_BAMBOO = register("stripped_bamboo_chair", () -> new ChairBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> COFFEE_TABLE_BAMBOO = register("bamboo_coffee_table", () -> new CoffeeTableBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> COFFEE_TABLE_STRIPPED_BAMBOO = register("stripped_bamboo_coffee_table", () -> new CoffeeTableBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> CABINET_BAMBOO = register("bamboo_cabinet", () -> new CabinetBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> CABINET_STRIPPED_BAMBOO = register("stripped_bamboo_cabinet", () -> new CabinetBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> BEDSIDE_CABINET_BAMBOO = register("bamboo_bedside_cabinet", () -> new BedsideCabinetBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> BEDSIDE_CABINET_STRIPPED_BAMBOO = register("stripped_bamboo_bedside_cabinet", () -> new BedsideCabinetBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> DESK_BAMBOO = register("bamboo_desk", () -> new DeskBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS), DeskBlock.MaterialType.OAK));
    public static final RegistryObject<Block> DESK_STRIPPED_BAMBOO = register("stripped_bamboo_desk", () -> new DeskBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS), DeskBlock.MaterialType.STRIPPED_OAK));
    public static final RegistryObject<Block> DESK_CABINET_BAMBOO = register("bamboo_desk_cabinet", () -> new DeskCabinetBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS), DeskBlock.MaterialType.OAK));
    public static final RegistryObject<Block> DESK_CABINET_STRIPPED_BAMBOO = register("stripped_bamboo_desk_cabinet", () -> new DeskCabinetBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS), DeskBlock.MaterialType.STRIPPED_OAK));
    public static final RegistryObject<Block> BLINDS_BAMBOO = register("bamboo_blinds", () -> new BlindsBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> BLINDS_STRIPPED_BAMBOO = register("stripped_bamboo_blinds", () -> new BlindsBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> UPGRADED_FENCE_BAMBOO = register("bamboo_upgraded_fence", () -> new UpgradedFenceBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> UPGRADED_FENCE_STRIPPED_BAMBOO = register("stripped_bamboo_upgraded_fence", () -> new UpgradedFenceBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> UPGRADED_GATE_BAMBOO = register("bamboo_upgraded_gate", () -> new UpgradedGateBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> UPGRADED_GATE_STRIPPED_BAMBOO = register("stripped_bamboo_upgraded_gate", () -> new UpgradedGateBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> CRATE_BAMBOO = register("bamboo_crate", () -> new CrateBlock(Block.Properties.copy(Blocks.CHEST)));
    public static final RegistryObject<Block> CRATE_STRIPPED_BAMBOO = register("stripped_bamboo_crate", () -> new CrateBlock(Block.Properties.copy(Blocks.CHEST)));
    public static final RegistryObject<Block> PARK_BENCH_BAMBOO = register("bamboo_park_bench", () -> new ParkBenchBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> PARK_BENCH_STRIPPED_BAMBOO = register("stripped_bamboo_park_bench", () -> new ParkBenchBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> MAIL_BOX_BAMBOO = register("bamboo_mail_box", () -> new MailBoxBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> MAIL_BOX_STRIPPED_BAMBOO = register("stripped_bamboo_mail_box", () -> new MailBoxBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> KITCHEN_COUNTER_BAMBOO = register("bamboo_kitchen_counter", () -> new KitchenCounterBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> KITCHEN_COUNTER_STRIPPED_BAMBOO = register("stripped_bamboo_kitchen_counter", () -> new KitchenCounterBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> KITCHEN_DRAWER_BAMBOO = register("bamboo_kitchen_drawer", () -> new KitchenDrawerBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> KITCHEN_DRAWER_STRIPPED_BAMBOO = register("stripped_bamboo_kitchen_drawer", () -> new KitchenDrawerBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> KITCHEN_SINK_LIGHT_BAMBOO = register("bamboo_kitchen_sink_light", () -> new KitchenSinkBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS), true));
    public static final RegistryObject<Block> KITCHEN_SINK_LIGHT_STRIPPED_BAMBOO = register("stripped_bamboo_kitchen_sink_light", () -> new KitchenSinkBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS), true));
    public static final RegistryObject<Block> KITCHEN_SINK_DARK_BAMBOO = register("bamboo_kitchen_sink_dark", () -> new KitchenSinkBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS), true));
    public static final RegistryObject<Block> KITCHEN_SINK_DARK_STRIPPED_BAMBOO = register("stripped_bamboo_kitchen_sink_dark", () -> new KitchenSinkBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS), true));

    private static RegistryObject<Block> register(String name, Supplier<Block> block) {
        return register(name, block, new Item.Properties());
    }

    private static RegistryObject<Block> register(String name, Supplier<Block> block, Item.Properties properties) {
        RegistryObject<Block> registryObject = BLOCKS.register(name, block);
        RegistryObject<Item> itemRegistryObject = ITEMS.register(name, () -> new BlockItem(registryObject.get(), properties));
        ITEMLIST.add(itemRegistryObject);
        return registryObject;
    }

}
