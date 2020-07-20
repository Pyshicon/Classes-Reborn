package io.github.pyshicon.classesreborn.classes;

import io.github.pyshicon.classesreborn.api.Storage;

import java.util.ArrayList;

public class ClassFile {

    private static final Storage storage = new Storage("class");

    protected static ArrayList<String> getIds() {
        return new ArrayList<String>(storage.getYamlConfiguration().getConfigurationSection("").getKeys(false));
    }

    protected static String getName(String id) {
        return storage.getYamlConfiguration().getString(id + ".name");
    }

    protected static String getStrength(String id) {
        return storage.getYamlConfiguration().getString(id + ".attributes.strength");
    }

    protected static String getDexterity(String id) {
        return storage.getYamlConfiguration().getString(id + ".attributes.dexterity");
    }

    protected static String getConstitution(String id) {
        return storage.getYamlConfiguration().getString(id + ".attributes.constitution");
    }

    protected static void setName(String id, String name) {
        storage.getYamlConfiguration().set(id + ".name", name);
    }

    protected static void setStrength(String id, int point) {
        storage.getYamlConfiguration().set(id + ".attributes.strength", point);
    }

    protected static void setDexterity(String id, int point) {
        storage.getYamlConfiguration().set(id + ".attributes.dexterity", point);
    }

    protected static void setConstitution(String id, int point) {
        storage.getYamlConfiguration().set(id + ".attributes.constitution", point);
    }

    public static void init() {
        if (!storage.getFile().exists()) {
            setName("example", "Example");
            setStrength("example", 10);
            setDexterity("example", 10);
            setConstitution("example", 10);
            storage.save();
        }
    }
}
