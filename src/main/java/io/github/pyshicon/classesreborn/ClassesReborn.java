package io.github.pyshicon.classesreborn;

import io.github.pyshicon.classesreborn.classes.ClassFile;
import io.github.pyshicon.classesreborn.configuration.MessageFile;
import org.bukkit.plugin.java.JavaPlugin;

public class ClassesReborn extends JavaPlugin {

    public void onEnable() {
        MessageFile.init();
        ClassFile.init();
    }

    public void onDisable() {
    }
}
