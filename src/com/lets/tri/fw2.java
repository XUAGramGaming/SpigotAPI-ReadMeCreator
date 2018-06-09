package com.lets.tri;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class fw2 extends JavaPlugin {
	
	 private File customConfigFile;
	 private FileConfiguration customConfig;

	 public void onEnable(){
		 createCustomConfig();
	 }
	 
	 public FileConfiguration getCustomConfig() {   
		 return this.customConfig;
     }

     private void createCustomConfig() {
         customConfigFile = new File(getDataFolder(), "readme.txt");
         if (!customConfigFile.exists()) {
             customConfigFile.getParentFile().mkdirs();
             saveResource("readme.txt", false);
         }
      }
	 
	
}
