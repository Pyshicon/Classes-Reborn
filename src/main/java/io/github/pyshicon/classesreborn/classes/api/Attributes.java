package io.github.pyshicon.classesreborn.classes.api;

public class Attributes {

    private int points;

    protected Attributes(int points) {
        this.points = points;
    }

    int getPoints() {
        return this.points;
    }

    void setPoints(int points) {
        this.points = points;
    }

    void addPoints(int points) {
        this.points =+ points;
    }

    void subtractPoints(int points) {
        this.points =- points;
    }
}
