package com.example.CroniclePlugin.Configs;

import com.example.CroniclePlugin.CroniclePlugin;
import com.example.CroniclePlugin.Utils;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public abstract class Config extends YamlConfiguration {
    protected CroniclePlugin main;
    protected String name;
    protected File file;

    public Config(CroniclePlugin main, String name){
        this.main = main;
        this.name = name;
        file = new File(main.getDataFolder(), name);
    }

    public void checkFile(){
        if (!file.exists()){
            file.getParentFile().mkdirs();
            main.saveResource(name, false);
        }
    }

    public void loadConfig() {
        checkFile();
        try{
            load(file);
            Utils.log("Loaded data from "+ name + "!");
        }catch(InvalidConfigurationException | IOException exception) {
            exception.printStackTrace();
            Utils.log("Error loading data from " + name + "!");
        }

    }

    public void saveConfig() {
        checkFile();
        try{
            save(file);
            Utils.log("Saved data from "+ name + "!");
        }catch (IOException exception){
            exception.printStackTrace();
            Utils.log("Error saving data from " + name + "!");
        }
    }

}
