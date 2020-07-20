package io.github.pyshicon.classesreborn.classes;

import io.github.pyshicon.classesreborn.classes.attributes.Attributes;
import javafx.scene.paint.Material;

public class Class {

    private String id;
    private String name;
    private Material icon;
    private int slot;
    private final Attributes attributes;

    public Class(String id, String name, Material icon, int slot, Attributes attributes) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.slot = slot;
        this.attributes = attributes;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Material getIcon() {
        return icon;
    }

    public int getSlot() {
        return slot;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIcon(Material icon) {
        this.icon = icon;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}
