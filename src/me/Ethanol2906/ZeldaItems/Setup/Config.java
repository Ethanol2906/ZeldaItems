package me.Ethanol2906.ZeldaItems.Setup;

import me.Ethanol2906.ZeldaItems.Main;

import org.bukkit.configuration.file.FileConfiguration;

public class Config 
{
	public static Main plugin;
	
	public static void setup(Main instance)
	{
		plugin = instance;
		
		FileConfiguration cfg = plugin.getConfig();
		cfg.options().copyDefaults();
		plugin.saveConfig();
	}
}
