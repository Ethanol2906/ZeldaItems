package me.Ethanol2906.ZeldaItems.Items;

import java.util.List;
import java.util.ArrayList;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemModder 
{
	public static ItemStack setName(ItemStack is, String Name) 
	{
		ItemStack object = is;
		ItemMeta meta = is.getItemMeta();
		meta.setDisplayName(Name);
		object.setItemMeta(meta);		
		return object;
	}
	
	public static ItemStack setLore(ItemStack item, String lore) {
		ItemMeta im = item.getItemMeta();
		List<String> l = new ArrayList<String>();
		l.add(lore);
		im.setLore(l);
		item.setItemMeta(im);		
		return item;
	}
	
	public static ItemStack setDurability(ItemStack item, int i) {
		item.setDurability((short)i);
		return item;
	}
}
