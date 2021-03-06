package net.purry.tutorial;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;
import net.purry.tutorial.block.BlockOre;
import net.purry.tutorial.block.BlockCropBanana;

public class ModBlocks {

    public static BlockOre oreBanana = new BlockOre("ore_banana").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockCropBanana cropBanana = new BlockCropBanana();




    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreBanana, cropBanana
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreBanana.createItemBlock()

        );
    }

    public static void registerModels() {
        oreBanana.registerItemModel(Item.getItemFromBlock(oreBanana));

    }


}