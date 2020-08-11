package com.akhter.designpatterns.behavioural.command.example2;

public class Copy implements EditorCommand {
    
    @Override
    public void execute() {
        Editor.get().copy();
    }
}

