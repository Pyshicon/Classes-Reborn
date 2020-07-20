package io.github.pyshicon.classesreborn.classes.attributes;

import io.github.pyshicon.classesreborn.classes.attributes.types.Constitution;
import io.github.pyshicon.classesreborn.classes.attributes.types.Dexterity;
import io.github.pyshicon.classesreborn.classes.attributes.types.Strength;

public class Attributes {

    private final Strength strength;
    private final Dexterity dexterity;
    private final Constitution constitution;

    protected Attributes(Strength strength, Dexterity dexterity, Constitution constitution) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
    }

    protected Strength getStrength() {
        return strength;
    }

    protected Dexterity getDexterity() {
        return dexterity;
    }

    protected Constitution getConstitution() {
        return constitution;
    }
}
