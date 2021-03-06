package com.akhter.designpatterns.behavioural.command.example1;

public class VolumeDown implements TVCommand {

    private Television television;

    public VolumeDown(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.volumeDown();
    }
}



