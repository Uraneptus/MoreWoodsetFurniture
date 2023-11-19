package com.uraneptus.woodset_furniture.data;

import com.uraneptus.woodset_furniture.MoreWoodsetFurniture;
import com.uraneptus.woodset_furniture.core.registry.MWFBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.commons.compress.utils.Lists;

import java.util.List;
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
        var translation = "";
        List<String> translationParts = Lists.newArrayList();
        var splitList = path.split("_");
        for (String split : splitList) {
            var capitalized = firstToUpperCase(split);
            translationParts.add(capitalized);
        }
        translation = String.join(" ", translationParts);
        return translation;
    }

    public static String firstToUpperCase(String string) {
        var firstLetter = string.charAt(0);
        return string.replaceFirst(String.valueOf(firstLetter), String.valueOf(firstLetter).toUpperCase());
    }
}
