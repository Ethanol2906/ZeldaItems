package me.Ethanol2906.ZeldaItems.Lists;

import me.Ethanol2906.ZeldaItems.Items.ItemModder;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ArmourList {
	
	public static ItemStack getItem(String ConfigName) {
		ItemStack item = new ItemStack(Material.AIR, 1);
		
		if (ConfigName.equalsIgnoreCase("BlueTunic")) {
			item.setType(Material.LEATHER_HELMET);
			LeatherArmorMeta meta = (LeatherArmorMeta)item.getItemMeta();
			meta.setColor(Color.fromRGB(18, 32, 181));
			item = ItemModder.setName(item, ChatColor.BLUE + "Blue Tunic");
			item = ItemModder.setLore(item, ChatColor.AQUA + "With this tunic you will never drown again!");
			item.setItemMeta(meta);
		}
		
		if (ConfigName.equalsIgnoreCase("RedTunic")) {
			item.setType(Material.LEATHER_HELMET);
			LeatherArmorMeta meta = (LeatherArmorMeta)item.getItemMeta();
			meta.setColor(Color.fromRGB(156, 39, 39));
			item = ItemModder.setName(item, ChatColor.DARK_RED + "Red Tunic");
			item = ItemModder.setLore(item, ChatColor.RED + "With this tunic you will never Burn again!");
			item.setItemMeta(meta);
		}
		
		return item;
	}
}
