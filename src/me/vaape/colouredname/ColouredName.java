package me.vaape.colouredname;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;
import net.milkbowl.vault.permission.Permission;

public class ColouredName extends JavaPlugin implements Listener{
	
	public static ColouredName plugin;
	private static Permission perms = null;

	public void onEnable() {
		plugin = this;
		getLogger().info(ChatColor.GREEN + "ColouredName has been enabled!");
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable(){
		plugin = null;
	}
	
	public static ColouredName getInstance() {
		return plugin;
	}
	
	//nickcolor
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("nickcolor") || command.getName().equalsIgnoreCase("nickcolour")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				
				if (args.length > 0) {
					
					switch (args[0].toLowerCase()) {
					case "default":
						if (player.hasPermission("nickcolor.default")) {
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta removeprefix 1000");
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta addprefix 1000 &#c4c4c4");
							player.sendMessage(ChatColor.GREEN + "Name color successfully changed.");
						}
						else {
							player.sendMessage(ChatColor.RED + "You don't have permission for that color.");
						}
						break;
					case "iron":
						if (player.hasPermission("nickcolor.iron")) {
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta removeprefix 1000");
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta addprefix 1000 &#94c4f5");
							player.sendMessage(ChatColor.GREEN + "Name color successfully changed.");
						}
						else {
							player.sendMessage(ChatColor.RED + "You don't have permission for that color.");
						}
						break;
					case "gold":
						if (player.hasPermission("nickcolor.gold")) {
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta removeprefix 1000");
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta addprefix 1000 &6");
							player.sendMessage(ChatColor.GREEN + "Name color successfully changed.");
						}
						else {
							player.sendMessage(ChatColor.RED + "You don't have permission for that color.");
						}
						break;
					case "emerald":
						if (player.hasPermission("nickcolor.emerald")) {
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta removeprefix 1000");
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta addprefix 1000 &a");
							player.sendMessage(ChatColor.GREEN + "Name color successfully changed.");
						}
						else {
							player.sendMessage(ChatColor.RED + "You don't have permission for that color.");
						}
						break;
					case "diamond":
						if (player.hasPermission("nickcolor.diamond")) {
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta removeprefix 1000");
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta addprefix 1000 &b");
							player.sendMessage(ChatColor.GREEN + "Name color successfully changed.");
						}
						else {
							player.sendMessage(ChatColor.RED + "You don't have permission for that color.");
						}
						break;
					case "obsidian":
						if (player.hasPermission("nickcolor.obsidian")) {
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta removeprefix 1000");
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta addprefix 1000 &#7842ff");
							player.sendMessage(ChatColor.GREEN + "Name color successfully changed.");
						}
						else {
							player.sendMessage(ChatColor.RED + "You don't have permission for that color.");
						}
						break;
					case "bolddefault":
						if (player.hasPermission("nickcolor.bolddefault")) {
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta removeprefix 1000");
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta addprefix 1000 &#c4c4c4&l");
							player.sendMessage(ChatColor.GREEN + "Name color successfully changed.");
						}
						else {
							player.sendMessage(ChatColor.RED + "You don't have permission for that color.");
						}
						break;
					case "boldiron":
						if (player.hasPermission("nickcolor.boldiron")) {
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta removeprefix 1000");
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta addprefix 1000 &#94c4f5&l");
							player.sendMessage(ChatColor.GREEN + "Name color successfully changed.");
						}
						else {
							player.sendMessage(ChatColor.RED + "You don't have permission for that color.");
						}
						break;
					case "boldgold":
						if (player.hasPermission("nickcolor.boldgold")) {
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta removeprefix 1000");
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta addprefix 1000 &6&l");
							player.sendMessage(ChatColor.GREEN + "Name color successfully changed.");
						}
						else {
							player.sendMessage(ChatColor.RED + "You don't have permission for that color.");
						}
						break;
					case "boldemerald":
						if (player.hasPermission("nickcolor.boldemerald")) {
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta removeprefix 1000");
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta addprefix 1000 &a&l");
							player.sendMessage(ChatColor.GREEN + "Name color successfully changed.");
						}
						else {
							player.sendMessage(ChatColor.RED + "You don't have permission for that color.");
						}
						break;
					case "bolddiamond":
						if (player.hasPermission("nickcolor.bolddiamond")) {
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta removeprefix 1000");
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta addprefix 1000 &b&l");
							player.sendMessage(ChatColor.GREEN + "Name color successfully changed.");
						}
						else {
							player.sendMessage(ChatColor.RED + "You don't have permission for that color.");
						}
						break;
					case "boldobsidian":
						if (player.hasPermission("nickcolor.boldobsidian")) {
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta removeprefix 1000");
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta addprefix 1000 &#7842ff&l");
							player.sendMessage(ChatColor.GREEN + "Name color successfully changed.");
						}
						else {
							player.sendMessage(ChatColor.RED + "You don't have permission for that color.");
						}
						break;
					case "hex":
						if (player.hasPermission("nickcolor.hex")) {
							if (args.length > 1) {
								
								if (isHex(args[1])) {
									Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta removeprefix 1000");
									Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " meta addprefix 1000 &" + args[1]);
									player.sendMessage(ChatColor.GREEN + "Name color changed.");
								}
								else {
									player.sendMessage(ChatColor.RED + "Invalid Hex value, use the format #FFFFFF");
								}
							}
							else {
								player.sendMessage(ChatColor.RED + "Wrong usage, try /nickcolor hex #FFFFFF");
							}
						}
						else {
							player.sendMessage(ChatColor.RED + "You don't have permission for that color.");
						}
						break;
					default:
							player.sendMessage(ChatColor.RED + "Couldn't find nickcolor " + args[0] + ". Try " + "\n" + ChatColor.of("#ff0000") +
									"H" + ChatColor.of("#00ff37") + "e" + ChatColor.of("#005eff") + "x" + ChatColor.of("#c4c4c4") + "\n" + 
									"Default " + "\n" + ChatColor.of("#94c4f5") +
									"Iron " + "\n" + ChatColor.GOLD +
									"Gold " + "\n" + ChatColor.GREEN +
									"Emerald " + "\n" + ChatColor.AQUA +
									"Diamond " + "\n" + ChatColor.of("#7842ff") +
									"Obsidian " + "\n" + ChatColor.of("#c4c4c4") + ChatColor.BOLD +
									"BoldDefault " + "\n" + ChatColor.of("#94c4f5") + ChatColor.BOLD +
									"BoldIron " + "\n" + ChatColor.GOLD + ChatColor.BOLD +
									"BoldGold " + "\n" + ChatColor.GREEN + ChatColor.BOLD +
									"BoldEmerald " + "\n" + ChatColor.AQUA + ChatColor.BOLD +
									"BoldDiamond " + "\n" + ChatColor.of("#7842ff") + ChatColor.BOLD +
									"BoldObsidian");
					}							
				}
				else {
					player.sendMessage(ChatColor.RED + "Wrong usage, try /nickcolor [color]");
				}
			}
			else {
				sender.sendMessage(ChatColor.RED + "You must be a player.");
			}
			return true;
		}
		return false;
	}
	
	public static boolean isHex(String string) {
		String regex = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
		
		Pattern p = Pattern.compile(regex);
		
		if (string == null) {
			return false;
		}
		
		Matcher m = p.matcher(string);
		
		return m.matches();		
	}
}
