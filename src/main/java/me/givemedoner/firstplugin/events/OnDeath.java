package me.givemedoner.firstplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OnDeath implements Listener {


    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        Player player = event.getEntity().getPlayer();

        player.sendMessage(ChatColor.RED + "Wat een tantoe noob ben jij, je bent gewoon dood gegaan." );
    }
}
