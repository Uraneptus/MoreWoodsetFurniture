package com.uraneptus.woodset_furniture.data;

import com.uraneptus.woodset_furniture.MoreWoodsetFurniture;
import com.uraneptus.woodset_furniture.core.registry.MWFBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;
import java.util.function.Supplier;

public class MWFLangProvider extends LanguageProvider {

    public MWFLangProvider(PackOutput output) {
        super(output, MoreWoodsetFurniture.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        MWFBlocks.ITEMLIST.forEach(this::forItem);
    }

    public void forItem(Supplier<? extends Item> item) {
        addItem(item, createTranslation(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item.get())).getPath()));
    }

    public static String createTranslation(String path) {
        final StringBuilder builder = new StringBuilder();

        for (String part : path.split("_")) {
            if (!builder.isEmpty()) {
                builder.append(" ");
            }
            builder.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1));
        }
        return builder.toString();
    }
}
