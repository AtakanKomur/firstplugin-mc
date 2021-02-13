package me.givemedoner.firstplugin;

import me.givemedoner.firstplugin.commands.die;
import me.givemedoner.firstplugin.commands.heal;
import me.givemedoner.firstplugin.events.OnDeath;
import me.givemedoner.firstplugin.events.antishear;
import me.givemedoner.firstplugin.events.bed;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        System.out.println("-------------------------------------------------------------");
        System.out.println("De plugin word momenteel opgestart, Noob Dev is Atakan#0037");
        System.out.println("-------------------------------------------------------------");

        getServer().getPluginManager().registerEvents(new OnDeath(), this );
        getServer().getPluginManager().registerEvents(new bed(), this);
        getServer().getPluginManager().registerEvents(new antishear(), this);

        getCommand("heal").setExecutor(new heal());
        getCommand("die").setExecutor(new die());

    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("-------------------------------------------------------------");
        System.out.println("De plugin word momenteel afgesloten, Noob Dev is Atakan#0037");
        System.out.println("-------------------------------------------------------------");
    }

}
