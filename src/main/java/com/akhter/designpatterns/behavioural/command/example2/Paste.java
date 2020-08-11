package com.akhter.designpatterns.behavioural.command.example2;

public class Paste implements EditorCommand {

    @Override
    public void execute() {
        Editor.get().paste();
    }
}
