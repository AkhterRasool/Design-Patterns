package com.akhter.designpatterns.behavioural.command.example1;

public class TurnTVOff implements TVCommand {

    private Television television;

    public TurnTVOff(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}

