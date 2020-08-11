package com.akhter.designpatterns.behavioural.command.example1;

import static com.akhter.designpatterns.behavioural.command.example1.VoiceCommands.SHUT_TV_DOWN;
import static com.akhter.designpatterns.behavioural.command.example1.VoiceCommands.TURN_TV_ON;
import static com.akhter.designpatterns.behavioural.command.example1.VoiceCommands.VOLUME_DOWN;
import static com.akhter.designpatterns.behavioural.command.example1.VoiceCommands.VOLUME_UP;

public class CommandClient {
    public static void main(String[] args) {
        invokeTVCommandsViaRemote();
        System.out.println();
        System.out.println();
        System.out.println();
        invokeTVCommandsViaVoice();
    }

    private static void invokeTVCommandsViaRemote() {
        System.out.println("Issuing commands via remote control.");
        TVRemote remote = new TVRemote();
        Television television = new Television();
        remote.issueCommand(new TurnTVOn(television));
        remote.issueCommand(new VolumeUp(television));
        remote.issueCommand(new VolumeUp(television));
        remote.issueCommand(new VolumeDown(television));
        remote.issueCommand(new TurnTVOff(television));
    }

    private static void invokeTVCommandsViaVoice() {
        System.out.println("Issuing commands via voice.");
        Television television = new Television();
        VoiceManager voiceManager = new VoiceManager(television);
        voiceManager.execute(TURN_TV_ON);
        voiceManager.execute(VOLUME_UP);
        voiceManager.execute(VOLUME_UP);
        voiceManager.execute(VOLUME_UP);
        voiceManager.execute(VOLUME_DOWN);
        voiceManager.execute(SHUT_TV_DOWN);
    }
}


