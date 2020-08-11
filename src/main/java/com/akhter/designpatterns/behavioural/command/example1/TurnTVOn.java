package com.akhter.designpatterns.behavioural.command.example1;

public class TurnTVOn implements TVCommand {

    private Television television;

    public TurnTVOn(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}


