package com.th3wyatt.practice;

import com.th3wyatt.practice.handler.ConfigurationHandler;
import com.th3wyatt.practice.init.ModBlocks;
import com.th3wyatt.practice.init.ModItems;
import com.th3wyatt.practice.init.Recipes;
import com.th3wyatt.practice.proxy.IProxy;
import com.th3wyatt.practice.reference.Reference;
import com.th3wyatt.practice.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
public class practice {

    @Mod.Instance(Reference.MOD_ID)
    public static practice instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete");

        ModItems.init();
        ModBlocks.init();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        Recipes.init();
        LogHelper.info("Initializaton Complete");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initializaton Complete");

    }
}
