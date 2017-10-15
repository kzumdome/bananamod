package net.purry.tutorial;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.purry.tutorial.TutorialMod;
import net.purry.tutorial.item.ItemBanana;
import net.purry.tutorial.item.ItemBananaSeed;
import net.purry.tutorial.item.ItemBase;
//import net.purry.tutorial.item.tool.*;

public class ModItems {

    public static ItemBase ingotBanana = new ItemBase("ingot_banana");
    public static ItemBanana banana = new ItemBanana();
    public static ItemBananaSeed bananaSeed = new ItemBananaSeed();
   // public static ItemSword copperSword = new ItemSword(TutorialMod.copperToolMaterial, "copper_sword");
   // public static ItemPickaxe copperPickaxe = new ItemPickaxe(TutorialMod.copperToolMaterial, "copper_pickaxe");
   // public static ItemShovel copperShovel = new ItemShovel(TutorialMod.copperToolMaterial, "copper_shovel");
   // public static ItemAxe copperAxe = new ItemAxe(TutorialMod.copperToolMaterial, "copper_axe");
   // public static ItemHoe copperHoe = new ItemHoe(TutorialMod.copperToolMaterial, "copper_hoe");
    //public static ItemArmor copperHelmet = new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.HEAD, "copper_helmet");
    //public static ItemArmor copperChestplate = new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.CHEST, "copper_chestplate");
    //public static ItemArmor copperLeggings = new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.LEGS, "copper_leggings");
    //public static ItemArmor copperBoots = new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.FEET, "copper_boots");

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotBanana,
                banana,
                bananaSeed

        );
    }

    public static void registerModels() {
        ingotBanana.registerItemModel();
        banana.registerItemModel();
        bananaSeed.registerItemModel();
      //  copperSword.registerItemModel();
        //copperPickaxe.registerItemModel();
        //copperShovel.registerItemModel();
        //copperAxe.registerItemModel();
        //copperHoe.registerItemModel();
        //copperHelmet.registerItemModel();
        //copperChestplate.registerItemModel();
        //copperLeggings.registerItemModel();
        //copperBoots.registerItemModel();
    }

}