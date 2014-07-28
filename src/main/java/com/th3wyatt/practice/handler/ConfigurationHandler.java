package com.th3wyatt.practice.handler;

import com.th3wyatt.practice.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Jon on 7/27/2014.
 */
public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile){

        // Create the config object from the given config file
        if (configuration == null){

            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event){

        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){

            // Resync configs
            loadConfiguration();
        }

    }

    private static void loadConfiguration(){

        testValue = configuration.getBoolean("configValue", configuration.CATEGORY_GENERAL, false, "This is an example Config Value");

        if (configuration.hasChanged()){

            configuration.save();

        }

    }
}
