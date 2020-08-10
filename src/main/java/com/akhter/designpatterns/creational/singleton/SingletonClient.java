package com.akhter.designpatterns.creational.singleton;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton firstSingleObj = Singleton.get();
        Singleton secondSingleObj = Singleton.get();
        System.out.println(firstSingleObj == secondSingleObj);
    }
}
