package com.akhter.designpatterns.behavioural.command.example1;

public class VolumeUp implements TVCommand {

    private Television television;

    public VolumeUp(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.volumeUp();
    }
}


