package me.givemedoner.firstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class die implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if(command.getName().equals("die")) {
            if (sender instanceof Player) {

                Player player = (Player) sender;
                if(player.getHealth() == 0){
                    player.sendMessage(ChatColor.AQUA + "[GMD-DIE]" + ChatColor.RED + " Je bent succesvol dood gegaan." );
                }else{
                    player.setHealth(0);
                    player.sendMessage(ChatColor.AQUA + "[GMD-HEAL]" + ChatColor.RED + " Je bent succesvol dood gegaan." );
                }
            }else{
                System.out.println("-------------------------------------------------------------");
                System.out.println("Wie wil je dood maken?");
                System.out.println("-------------------------------------------------------------");
            }
        }
        return true;
    }

}

