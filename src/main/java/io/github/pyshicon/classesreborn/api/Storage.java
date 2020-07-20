package io.github.pyshicon.classesreborn.api;

import io.github.pyshicon.classesreborn.ClassesReborn;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class Storage {

    private String yml;
    private File file = new File(JavaPlugin.getPlugin(ClassesReborn.class).getDataFolder(), yml);
    private YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);

    public Storage(String yml) {
        this.yml = yml + ".yml";
    }

    public File getFile() {
        return file;
    }

    public YamlConfiguration getYamlConfiguration() {
        return yamlConfiguration;
    }

    public void save() {
        try {
            yamlConfiguration.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        YamlConfiguration.loadConfiguration(file);
    }
}
