package net.purry.tutorial.block;


import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.purry.tutorial.ModItems;

public class BlockCropBanana extends BlockCrops {

    public BlockCropBanana() {
        setUnlocalizedName("crop_banana");
        setRegistryName("crop_banana");

       // setCreativeTab(TutorialMod.creativeTab);
    }

    @Override
    protected Item getSeed() {
        return ModItems.bananaSeed;
    }

    @Override
    protected Item getCrop() {
        return ModItems.banana;
    }

}

