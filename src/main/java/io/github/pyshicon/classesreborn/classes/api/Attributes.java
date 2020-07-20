package io.github.pyshicon.classesreborn.classes.api;

public class Attributes {

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

    public void addPoints(int points) {
        this.points =+ points;
    }

    public void subtractPoints(int points) {
        this.points =- points;
    }
}
