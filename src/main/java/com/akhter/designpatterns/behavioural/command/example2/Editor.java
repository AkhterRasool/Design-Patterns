package com.akhter.designpatterns.behavioural.command.example2;

public class Editor {
    private String selection;
    private static Editor editor;
    private static String clipboard;
    private Editor() { setSelection(""); }

    public static Editor get() {
        if (editor == null) {
            editor = new Editor();
        }
        return editor;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public String getSelection() {
        return selection;
    }

    public String cut() {
        clipboard = getSelection();
        setSelection("");
        System.out.println("[CUT]\t" + getSelection());
        return clipboard;
    }

    public String copy() {
        clipboard = getSelection();
        System.out.println("[COPY]\t" + getSelection());
        return getSelection();
    }

    public void paste() {
        setSelection(getSelection() + clipboard);
        System.out.println("[PASTE]\t" + getSelection());
    }
}
