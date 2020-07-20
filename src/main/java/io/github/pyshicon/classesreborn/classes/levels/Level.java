package io.github.pyshicon.classesreborn.classes.levels;

public class Level {

    private int level;
    private int maxLevel;

    protected Level(int level, int maxLevel) {
        this.level = level;
        this.maxLevel = maxLevel;
    }

    protected int getLevel() {
        return level;
    }

    protected void setLevel(int level) {
        this.level = level;
    }

    protected void addLevel(int level) {
        this.level =+ level;
    }

    protected void subtractLevel(int level) {
        this.level =- level;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public void addMaxLevel(int maxLevel) {
        this.maxLevel =+ maxLevel;
    }

    public void subtractMaxLevel(int maxLevel) {
        this.maxLevel =- maxLevel;
    }
}
