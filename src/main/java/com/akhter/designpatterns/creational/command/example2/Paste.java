package com.akhter.designpatterns.creational.command.example2;

public class Paste implements EditorCommand {

    @Override
    public void execute() {
        Editor.get().paste();
    }
}
