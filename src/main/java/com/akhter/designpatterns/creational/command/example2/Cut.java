package com.akhter.designpatterns.creational.command.example2;

public class Cut implements EditorCommand {

    @Override
    public void execute() {
        Editor.get().cut();
    }
}
