package me.givemedoner.firstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if(command.getName().equals("heal")) {
            if (sender instanceof Player) {

                Player player = (Player) sender;
                if(player.getHealth() == 20.0){
                    player.sendMessage(ChatColor.AQUA + "[GMD-HEAL]" + ChatColor.RED + " Je bent succesvol gehealed." );
                }else{
                    player.sendMessage(ChatColor.AQUA + "[GMD-HEAL]" + ChatColor.RED + " Je bent succesvol gehealed." );
                    player.setHealth(20);
                }
            }else{
                System.out.println("-------------------------------------------------------------");
                System.out.println("Wie wil je healen?");
                System.out.println("-------------------------------------------------------------");
            }
        }
        return true;
    }

    }

