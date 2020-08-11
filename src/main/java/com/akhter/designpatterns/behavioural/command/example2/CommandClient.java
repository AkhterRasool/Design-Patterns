package com.akhter.designpatterns.behavioural.command.example2;

import static com.akhter.designpatterns.behavioural.command.example2.Keyboard.Command.CTRLC;
import static com.akhter.designpatterns.behavioural.command.example2.Keyboard.Command.CTRLV;
import static com.akhter.designpatterns.behavioural.command.example2.Keyboard.Command.CTRLX;

public class CommandClient {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        keyboard.type("Hello ");
        keyboard.perform(CTRLX);
        keyboard.type("world ");
        keyboard.perform(CTRLC);
        keyboard.perform(CTRLV);
        keyboard.perform(CTRLX);
        keyboard.perform(CTRLV);
        keyboard.type("Hello ");
        keyboard.perform(CTRLX);
        keyboard.type("Hi ");
        keyboard.perform(CTRLC);
        keyboard.perform(CTRLV);
        keyboard.type("Hello world ");
        keyboard.perform(CTRLC);
        keyboard.perform(CTRLV);
    }
}
