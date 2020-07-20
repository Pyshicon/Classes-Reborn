package io.github.pyshicon.classesreborn.classes.api;

import io.github.pyshicon.classesreborn.classes.attributes.Constitution;
import io.github.pyshicon.classesreborn.classes.attributes.Dexterity;
import io.github.pyshicon.classesreborn.classes.attributes.Strength;
import javafx.scene.paint.Material;

public class Class {

    private final String id;
    private final String name;
    private final Material icon;
    private int level;
    private int exp;
    private final Strength strength;
    private final Constitution constitution;
    private final Dexterity dexterity;

    public Class(String id, String name, Material icon, int level, int exp, Strength strength, Constitution constitution, Dexterity dexterity) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.level = level;
        this.exp = exp;
        this.strength = strength;
        this.constitution = constitution;
        this.dexterity = dexterity;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void addLevel(int level) {
        this.level =+ level;
    }

    public void subtractLevel(int level) {
        this.level =- level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void addExp(int exp) {
        this.exp =+ exp;
    }

    public void subtractExp(int exp) {
        this.exp =- exp;
    }

    public Strength getStrength() {
        return strength;
    }

    public Constitution getConstitution() {
        return constitution;
    }

    public Dexterity getDexterity() {
        return dexterity;
    }
}
