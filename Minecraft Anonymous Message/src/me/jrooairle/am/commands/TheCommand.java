package me.jrooairle.am.commands;

import java.util.ArrayList;
import java.util.Collections;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.jrooairle.am.Main;

public class TheCommand implements CommandExecutor {

	
	private Main plugin;
		public TheCommand(Main plugin) {
			this.plugin = plugin;
			plugin.getCommand("am").setExecutor(this);
		}
	
	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] args) {
		if (arg0 instanceof Player) {
			Player p = (Player) arg0;
			if (p.hasPermission("am.use")) {
				Player pl = Bukkit.getPlayer(args[0]);
				ArrayList<String> argz = new ArrayList<String>();
				Collections.addAll(argz, args);
				argz.remove(0);
				String[] argzz = new String[argz.size()]; 
				argz.toArray(argzz); 
				String tosend = arrayToSpaces(argzz);
				pl.sendMessage(ChatColor.BOLD + "<Anonymous Message>:  " + tosend);
			} else {
				p.sendMessage(ChatColor.RED + "You do not have permission to excecute this command!");
			} 
		} else {
			Player pl = Bukkit.getPlayer(args[0]);
			ArrayList<String> argz = new ArrayList<String>();
			Collections.addAll(argz, args);
			argz.remove(0);
			String[] argzz = new String[argz.size()]; 
			argz.toArray(argzz);
			String tosend = arrayToSpaces(argzz);
			pl.sendMessage(ChatColor.BOLD + "<Anonymous Message>:  " + tosend);
		}
		return false;
	}
	
	public String arrayToSpaces(String[] args) {
		int len = args.length;
		int y = len;
		y--;
		String toreturn = "";
		for (int i = 0; i < y; i++) {
			toreturn = toreturn + args[i] + " ";
		}
		int z = len;
		z--;
		toreturn = toreturn + args[z];
		
		
		return toreturn;
		
		
		
	}

}
