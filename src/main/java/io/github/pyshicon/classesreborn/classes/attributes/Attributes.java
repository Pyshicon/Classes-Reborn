package io.github.pyshicon.classesreborn.classes.attributes;

public abstract class Attributes {

    private int points;

    public Attributes(int points) {
        this.points = points;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
