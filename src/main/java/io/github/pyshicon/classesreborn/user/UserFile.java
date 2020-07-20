package io.github.pyshicon.classesreborn.user;

import io.github.pyshicon.classesreborn.api.Storage;

public class UserFile {

    private static final Storage storage = new Storage("user");

    private static String getActiveClass(String uuid) {
        return storage.getYamlConfiguration().getString(uuid + ".active_class");
    }

    private static double getHealth(String uuid) {
        return storage.getYamlConfiguration().getDouble(uuid + ".status.health");
    }

    protected static void setActiveClass(String uuid, String c) {
        storage.getYamlConfiguration().set(uuid + ".active_class", c);
    }

    protected static void setHealth(String uuid, double health) {
        storage.getYamlConfiguration().set(uuid + ".status.health", health);
    }

    protected static void save() {
        storage.save();
    }

    protected static void load() {
        storage.load();
    }
}
