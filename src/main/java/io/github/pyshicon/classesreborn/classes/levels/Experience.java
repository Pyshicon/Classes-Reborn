package io.github.pyshicon.classesreborn.classes.levels;

public class Experience {

    private int currentExp;
    private int maxExp;

    protected Experience(int currentExp, int maxExp) {
        this.currentExp = currentExp;
        this.maxExp = maxExp;
    }

    public int getCurrentExp() {
        return currentExp;
    }

    public void setCurrentExp(int currentExp) {
        this.currentExp = currentExp;
    }

    public void addCurrentExp(int currentExp) {
        this.currentExp =+ currentExp;
    }

    public void subtractCurrentExp(int currentExp) {
        this.currentExp =- currentExp;
    }

    public int getMaxExp() {
        return maxExp;
    }

    public void setMaxExp(int maxExp) {
        this.maxExp = maxExp;
    }

    public void addMaxExp(int maxExp) {
        this.maxExp =+ maxExp;
    }

    public void subtractMaxExp(int maxExp) {
        this.maxExp =- maxExp;
    }
}
