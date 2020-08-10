package com.akhter.designpatterns.creational.command.example2;

public class Copy implements EditorCommand {
    
    @Override
    public void execute() {
        Editor.get().copy();
    }
}

