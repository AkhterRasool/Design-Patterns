package com.akhter.designpatterns.behavioural.command.example2;

public class Keyboard {

    public enum Command {
        CTRLC,
        CTRLV,
        CTRLX
    }

    public void perform(Command command) {
        EditorCommand editorCommand = null;
        switch (command) {
            case CTRLC:
                editorCommand = new Copy();
                break;
            case CTRLV:
                editorCommand = new Paste();
                break;
            case CTRLX:
                editorCommand = new Cut();
                break;
            default:
                System.out.println("No command found!");
        }

        if (editorCommand != null) {
            editorCommand.execute();
        }
    }

    public void type(String text) {
        Editor editor = Editor.get();
        String selection = editor.getSelection();
        editor.setSelection(selection + text);
        System.out.println("[TYPE]\t" + selection);
    }
}
