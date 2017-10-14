package net.purry.tutorial;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.purry.tutorial.item.ItemBase;

public class ModItems {



    public static ItemBase ingot_banana = new ItemBase("ingot_banana").setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingot_banana
        );
    }

    public static void registerModels() {
        ingot_banana.registerItemModel();
    }


}