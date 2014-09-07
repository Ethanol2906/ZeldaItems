package me.Ethanol2906.ZeldaItems.Listeners;

import me.Ethanol2906.ZeldaItems.Main;
import me.Ethanol2906.ZeldaItems.Items.Items;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.ItemStack;

public class TunicListener implements Listener 
{
	public Main plugin;
	
	public TunicListener(Main instance) {
		this.plugin = instance;
		this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
	
	private ItemStack blueTunic = new ItemStack(Items.BLUE_TUNIC);
	private ItemStack redTunic = new ItemStack(Items.RED_TUNIC);
	
	public void onPlayerDamage(EntityDamageEvent event) {
		if (event.getEntity() instanceof Player) {
			Player player = (Player) event.getEntity();
			if (player.getInventory().getChestplate() != null) {
				if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equalsIgnoreCase(redTunic.getItemMeta().getDisplayName())) {
					if (event.getCause().equals(DamageCause.LAVA) || event.getCause().equals(DamageCause.FIRE) || event.getCause().equals(DamageCause.FIRE_TICK)) {
						event.setCancelled(true);
					}
				}
				else if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equalsIgnoreCase(blueTunic.getItemMeta().getDisplayName())) {
					if (event.getCause().equals(DamageCause.DROWNING)) {
						event.setCancelled(true);
					}
				}
			}
		}
	}

}
