package io.github.pyshicon.classesreborn.classes;

import io.github.pyshicon.classesreborn.classes.api.Class;

import java.util.ArrayList;

public class Classes {

    private static final ArrayList<Class> classes = new ArrayList<Class>();

    public static ArrayList<Class> getClasses() {
        return classes;
    }

    public static Class getClass(String id) {
        for (int index = 0; index < classes.size(); index++) {
            if (classes.get(index).getId().equals(id)) {
                return classes.get(index);
            }
        }

        return null;
    }

    public static void addClass(Class c) {
        classes.add(c);
    }

    public static void removeClass(Class c) {
        classes.remove(c);
    }
}
