package net.purry.tutorial;

import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.purry.tutorial.ModBlocks;
import net.purry.tutorial.ModItems;


import net.purry.tutorial.Proxy.CommonProxy;


@Mod(modid = TutorialMod.modId, name = TutorialMod.name, version = TutorialMod.version, acceptedMinecraftVersions = "[1.12.2]")
public class TutorialMod {

    public static final String modId = "tutorial";
    public static final String name = "Tutorial Mod";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static TutorialMod instance;

    @SidedProxy(serverSide = "net.purry.tutorial.Proxy.CommonProxy", clientSide = "net.purry.tutorial.Proxy.ClientProxy")
    public static CommonProxy proxy;


    public static SimpleNetworkWrapper network;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
       // ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventBusSubscriber
    public static class RegsitrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ModBlocks.registerModels();
            ModItems.registerModels();

        }

    }

}