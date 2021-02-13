package me.givemedoner.firstplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class bed implements Listener {

    @EventHandler
    public void onEnterBed(PlayerBedEnterEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.RED + "Slaap lekker, ik hoop dat je lekker fijn kan slapen." );
    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.GREEN + "Goeiemorgen, je bent zojuist wakker geworden. Hopelijk heb je een fijn geslapen.");
    }
}
