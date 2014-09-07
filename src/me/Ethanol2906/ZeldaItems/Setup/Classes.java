package me.Ethanol2906.ZeldaItems.Setup;

import me.Ethanol2906.ZeldaItems.Main;
import me.Ethanol2906.ZeldaItems.Listeners.RocsFeatherListener;
import me.Ethanol2906.ZeldaItems.Listeners.DigListener;
import me.Ethanol2906.ZeldaItems.Listeners.TunicListener;


public class Classes 
{
	public static Main plugin;
	
	public static void setup(Main instance)
	{
		plugin = instance;
		
		new RocsFeatherListener(plugin);
		new DigListener(plugin);
		new TunicListener(plugin);
	}
}
