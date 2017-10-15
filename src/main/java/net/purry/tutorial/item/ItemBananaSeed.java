package net.purry.tutorial.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.purry.tutorial.TutorialMod;
import net.purry.tutorial.ModBlocks;

public class ItemBananaSeed extends ItemSeeds {

    public ItemBananaSeed() {
        super(ModBlocks.cropBanana, Blocks.FARMLAND);
        setUnlocalizedName("banana_seed");
        setRegistryName("banana_seed");

        //setCreativeTab(TutorialMod.creativeTab);
    }

    public void registerItemModel() {
        TutorialMod.proxy.registerItemRenderer(this, 0, "banana_seed");
    }

}
