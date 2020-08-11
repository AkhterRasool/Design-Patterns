package com.akhter.designpatterns.behavioural.command.example1;

public class VoiceManager {
    private Television television;

    public VoiceManager(Television television) {
        this.television = television;
    }


    public void execute(VoiceCommands voiceCommands) {
        TVCommand command = null;
        switch (voiceCommands) {
            case VOLUME_UP:
                command = new VolumeUp(television);
                break;
            case TURN_TV_ON:
                command = new TurnTVOn(television);
                break;
            case SHUT_TV_DOWN:
                command = new TurnTVOff(television);
                break;
            case VOLUME_DOWN:
                command = new VolumeDown(television);
                break;
            default:
                System.out.println("No suitable Voice command found.");
        }
        if (command != null) {
            command.execute();
        }
    }
}

