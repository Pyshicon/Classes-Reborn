package io.github.pyshicon.classesreborn.api;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Message {

    public static void sendMessage(Player player, String message) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }

    public static void sendMessage(CommandSender sender, String message) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }

    public static void sendConsoleMessage(String message) {
        ConsoleCommandSender consoleCommandSender = Bukkit.getConsoleSender();
        consoleCommandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }

    public static String formatColorCode(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
