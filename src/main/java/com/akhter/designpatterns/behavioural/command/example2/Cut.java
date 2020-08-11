package com.akhter.designpatterns.behavioural.command.example2;

public class Cut implements EditorCommand {

    @Override
    public void execute() {
        Editor.get().cut();
    }
}
