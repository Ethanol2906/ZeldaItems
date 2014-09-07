package me.Ethanol2906.ZeldaItems.Listeners;

import java.util.Random;

import me.Ethanol2906.ZeldaItems.Main;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class DigListener implements Listener {
	public Main plugin;
	
	public DigListener(Main instance) 	
	{
		this.plugin = instance;
		this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}

	private ItemStack zeldaShovel = new ItemStack(me.Ethanol2906.ZeldaItems.Items.Items.ZELDA_SHOVEL);
	private ItemStack zeldaRupee = new ItemStack(me.Ethanol2906.ZeldaItems.Items.Items.ZELDA_RUPEE);

	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		Player player = event.getPlayer();
		if (event.getBlock().getType() == Material.DIRT || event.getBlock().getType() == Material.GRASS) {
			if (player.getItemInHand() != null) {
				if (player.getItemInHand().getType() == zeldaShovel.getType()) {
					if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(zeldaShovel.getItemMeta().getDisplayName())) {
						Random randomGenerator = new Random();
						int randomInt = randomGenerator.nextInt(11);
						if (randomInt <= 3) {
							Block block = event.getBlock();
							block.setType(Material.AIR);
							block.getWorld().dropItemNaturally(block.getLocation(), zeldaRupee);
							block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.DIRT));
							event.setCancelled(true);
						}
					}
				}
			}
		} else if (event.getBlock().getType() == Material.SAND) {
			if (player.getItemInHand() != null) {
				if (player.getItemInHand().getType() == zeldaShovel.getType()) {
					if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(zeldaShovel.getItemMeta().getDisplayName())) {
						Random randomGenerator = new Random();
						int randomInt = randomGenerator.nextInt(11);
						if (randomInt <= 3) {
							Block block = event.getBlock();
							block.setType(Material.AIR);
							block.getWorld().dropItemNaturally(block.getLocation(), zeldaRupee);
							block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.SAND));
							event.setCancelled(true);
						}
					}
				}
			}
		}
	} 
}