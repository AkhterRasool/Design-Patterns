package com.akhter.designpatterns.creational.singleton;

public class Singleton {
    private static Singleton singleton;
    private Singleton() {}

    public static Singleton get() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }
}

