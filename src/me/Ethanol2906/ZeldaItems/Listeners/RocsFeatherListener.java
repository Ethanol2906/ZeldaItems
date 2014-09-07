package me.Ethanol2906.ZeldaItems.Listeners;

import me.Ethanol2906.ZeldaItems.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RocsFeatherListener implements Listener {
	public Main plugin;
	
	public RocsFeatherListener(Main instance)
	{
		this.plugin = instance;
		this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}

	@EventHandler
	public void onPlayerMover(PlayerMoveEvent event) {
		Player player = event.getPlayer();

		try {
			if ((player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "Roc's Feather"))) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999, 4));			
			}
		} 
		catch (NullPointerException localNullPointerException) 
		{
		}
	}
}
