package com.akhter.designpatterns.creational.command.example1;

public class TVRemote {
    public void issueCommand(TVCommand tvCommand) {
        tvCommand.execute();
    }
}
