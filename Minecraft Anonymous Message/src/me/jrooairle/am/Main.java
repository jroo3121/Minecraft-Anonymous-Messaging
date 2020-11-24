package me.jrooairle.am;

import org.bukkit.plugin.java.JavaPlugin;

import me.jrooairle.am.commands.TheCommand;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new TheCommand(this);
	}
	
}
