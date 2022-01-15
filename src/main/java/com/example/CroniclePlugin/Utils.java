package com.example.CroniclePlugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.logging.Logger;


public class Utils {
    private static Logger logger = CroniclePlugin.getPluginLogger();
    public static String color(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
    public static String decolor(String string){
        return ChatColor.stripColor(color(string));
    }

    public static void log(String... strings){
        for (String string : strings) {
            logger.info(string);
        }
    }

    public static void msgPlayer(Player player, String... strings){
        for (String string : strings){
            player.sendMessage(color(string));
        }
    }

}
