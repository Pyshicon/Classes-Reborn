package io.github.pyshicon.classesreborn.classes;

import io.github.pyshicon.classesreborn.classes.attributes.type.Constitution;
import io.github.pyshicon.classesreborn.classes.attributes.type.Dexterity;
import io.github.pyshicon.classesreborn.classes.attributes.type.Strength;

public class Classes {

    private final String id;
    private final String name;
    private final Strength strength;
    private final Constitution constitution;
    private final Dexterity dexterity;

    public Classes(String id, String name, Strength strength, Constitution constitution, Dexterity dexterity) {
        this.id = id;
        this.name = name;
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

    public Strength getStrength() {
        return this.strength;
    }

    public Constitution getConstitution() {
        return this.constitution;
    }

    public Dexterity getDexterity() {
        return this.dexterity;
    }
}
