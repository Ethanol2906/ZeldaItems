package me.Ethanol2906.ZeldaItems.Setup;

import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;
import me.Ethanol2906.ZeldaItems.Main;
import me.Ethanol2906.ZeldaItems.Items.Items;

public class Recipes 
{
	private static Main plugin;
	
	public static void setup(Main instance)
	{
		plugin = instance;
		
		if(plugin.getConfig().getBoolean("items.RocsFeather")) {
			RocsFeatherRecipe();
		}
		if(plugin.getConfig().getBoolean("items.FlameRod")) {
			FlameRodRecipe();
		}
		if(plugin.getConfig().getBoolean("items.ZeldaShovel")) {
			ZeldaShovelRecipe();
		}
		if(plugin.getConfig().getBoolean("tunic.BlueTunic")) {
			BlueTunicRecipe();
		}
		if(plugin.getConfig().getBoolean("tunic.RedTunic")) {
			RedTunicRecipe();
		}
	}
	
	public static void RocsFeatherRecipe() {
		ShapedRecipe r = new ShapedRecipe(Items.ROCS_FEATHER);
		r.shape(new String [] { " f ", " f ", " f " });
		r.setIngredient('f', Material.FEATHER);
		plugin.getServer().addRecipe(r);
	}
	public static void FlameRodRecipe() {
		ShapedRecipe r = new ShapedRecipe(Items.FLAME_ROD);
		r.shape(new String[] { " f ", " s ", " s " });
		r.setIngredient('f', Material.FIREWORK_CHARGE);
		r.setIngredient('s', Material.STICK);
		plugin.getServer().addRecipe(r);
	}
	public static void ZeldaShovelRecipe() {
		ShapedRecipe r = new ShapedRecipe(Items.ZELDA_SHOVEL);
		r.shape(new String[] { " e ", " s ", " s " });
		r.setIngredient('e', Material.EMERALD);
		r.setIngredient('s', Material.STICK);
		plugin.getServer().addRecipe(r);
	}
	public static void BlueTunicRecipe() {
		ShapedRecipe r = new ShapedRecipe(Items.BLUE_TUNIC);
		r.shape(new String[] { "B B", "LLL", "BLB"});
		r.setIngredient('B', Material.LAPIS_ORE);
		r.setIngredient('L', Material.LEATHER);
		plugin.getServer().addRecipe(r);
	}
	public static void RedTunicRecipe() {
		ShapedRecipe r = new ShapedRecipe(Items.RED_TUNIC);
		r.shape(new String[] { "R R", "LLL", "RLR"});
		r.setIngredient('R', Material.REDSTONE);
		r.setIngredient('L', Material.LEATHER);
		plugin.getServer().addRecipe(r);
	}
}
