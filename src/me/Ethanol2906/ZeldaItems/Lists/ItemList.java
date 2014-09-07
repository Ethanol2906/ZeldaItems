package me.Ethanol2906.ZeldaItems.Lists;

import java.util.*;

import me.Ethanol2906.ZeldaItems.Items.ItemModder;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemList {
	public static ItemStack getItem(String ConfigName) {
		ItemStack item = new ItemStack(Material.AIR, 1);

		if (ConfigName.equalsIgnoreCase("RocsFeather")) {
			item.setType(Material.FEATHER);
			item = ItemModder.setName(item, ChatColor.BLUE + "Roc's Feather");
			List<String> l = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.GREEN + "Holding this in hand while jumping will";
			String l2 = ChatColor.GREEN + "let the holder jump higher";
			l.add(l0);
			l.add(l1);
			l.add(l2);
			ItemMeta im = item.getItemMeta();
			im.setLore(l);
			item.setItemMeta(im);
			item = ItemModder.setDurability(item, 5);
		}

		if (ConfigName.equalsIgnoreCase("FlameRod")) {
			item.setType(Material.STICK);
			item = ItemModder.setName(item, ChatColor.RED + "Flame Rod");
			item = ItemModder.setLore(item, ChatColor.RED + "Right Click to fire a ball of flame");
		}
		
		if(ConfigName.equalsIgnoreCase("ZeldaShovel")) {
			item.setType(Material.DIAMOND_SPADE);
			item = ItemModder.setName(item, ChatColor.AQUA + "Zelda Shovel");
			item = ItemModder.setLore(item, ChatColor.BLUE + "Digging with this shovel may win you ZeldaRupees!");
		}
		
		if (ConfigName.equalsIgnoreCase("ZeldaRupee")) {
			item.setType(Material.EMERALD);
			item = ItemModder.setName(item, ChatColor.AQUA + "Zelda Rupee");
			List<String> l = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.GREEN + "Right click on the ground to";
			String l2 = ChatColor.GREEN + "put the emerald in your pouch";
			l.add(l0);
			l.add(l1);
			l.add(l2);
			ItemMeta im = item.getItemMeta();
			im.setLore(l);
			item.setItemMeta(im);
		}	
		
		return item;
	}
}
