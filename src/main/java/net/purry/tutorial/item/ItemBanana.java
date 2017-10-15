package net.purry.tutorial.item;

import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;
import net.purry.tutorial.TutorialMod;

public class ItemBanana extends ItemFood {

    public ItemBanana() {
        super(5, 0.6f, true);
        setUnlocalizedName("banana");
        setRegistryName("banana");
        //setCreativeTab(TutorialMod.creativeTab);
    }

    public void registerItemModel() {
        TutorialMod.proxy.registerItemRenderer(this, 0, "banana");
    }

    public void initOreDict() {
        OreDictionary.registerOre("cropBanana", this);
    }

}