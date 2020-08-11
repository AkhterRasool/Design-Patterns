package com.akhter.designpatterns.behavioural.command.example1;

public class TVRemote {
    public void issueCommand(TVCommand tvCommand) {
        tvCommand.execute();
    }
}
