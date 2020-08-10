package com.akhter.designpatterns.creational.command.example1;

public class Television {
    public void turnOff() {
        System.out.println("TV Turned off!");
    }

    public void turnOn() {
        System.out.println("TV Turned on!");
    }

    public void volumeUp() {
        System.out.println("TV's volume increased.");
    }

    public void volumeDown() {
        System.out.println("TV's volume decreased.");
    }
}

