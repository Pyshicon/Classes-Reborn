package io.github.pyshicon.classesreborn.classes.levels;

public class Progression {

    private final Level level;
    private final Experience experience;

    protected Progression(Level level, Experience experience) {
        this.level = level;
        this.experience = experience;
    }

    public Level getLevel() {
        return level;
    }

    public Experience getExperience() {
        return experience;
    }
}
