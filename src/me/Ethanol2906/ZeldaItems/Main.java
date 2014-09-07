package me.Ethanol2906.ZeldaItems;

import java.util.logging.Logger;

import me.Ethanol2906.ZeldaItems.Setup.Classes;
import me.Ethanol2906.ZeldaItems.Setup.Config;
import me.Ethanol2906.ZeldaItems.Setup.Recipes;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static Main plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		PluginDescriptionFile pdf = this.getDescription();
		logger.info(pdf.getName() + " Version: " + pdf.getVersion() + " has been Enabled!");
		
		Recipes.setup(this);
		Config.setup(this);
		Classes.setup(this);
	}
	
	public void onDisable() {
		PluginDescriptionFile pdf = this.getDescription();
		logger.info(pdf.getName() + " Version: " + pdf.getVersion() + " has been Disabled!");
	}
}
