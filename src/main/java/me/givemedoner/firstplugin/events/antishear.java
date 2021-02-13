package me.givemedoner.firstplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class antishear implements Listener {

    @EventHandler
    public void onSheatSheep(PlayerShearEntityEvent event){
        event.setCancelled(true);
        event.getPlayer().sendMessage(ChatColor.DARK_RED + "Hallo! Dit is niet toegestaan op de server.");
    }
}
