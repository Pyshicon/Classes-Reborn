package io.github.pyshicon.classesreborn.configuration;

import io.github.pyshicon.classesreborn.api.Message;
import io.github.pyshicon.classesreborn.api.Storage;

public class MessageFile {

    private static final Storage storage = new Storage("messages");

    private static final String prefix = "&7&l[&aClasses&7&l]&r ";

    public static String getPrefix() {
        return Message.formatColorCode(storage.getYamlConfiguration().getString("prefix"));
    }

    public static void init() {
        if (!storage.getFile().exists()) {
            storage.getYamlConfiguration().set("prefix", prefix);
            // do the init
            storage.save();
        }
    }
}
