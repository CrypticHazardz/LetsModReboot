package com.pahimar.letsmodreboot.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //Create the configuration object form the given file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            // Load the configuration file
            configuration.load();

            // Read in properties from configuration file
            configValue = configuration.get("ForgeCraft", "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch(Exception e)
        {
            // Log the exception
        }
        finally
        {
            //Save the configuration file
            configuration.save();
        }

        System.out.println("Configuration Test: " + configValue);
    }
}
