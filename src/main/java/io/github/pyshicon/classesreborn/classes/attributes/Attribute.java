package io.github.pyshicon.classesreborn.classes.attributes;

public abstract class Attribute {

    private String name;
    private int point;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getPoint() {
        return point;
    }

    protected void setPoint(int point) {
        this.point = point;
    }

    protected void addPoint(int point) {
        this.point =+ point;
    }

    protected void subtractPoint(int point) {
        this.point =- point;
    }
}
