package com.printer.inheritance;

public class Document {
    protected String title;
    protected String content;

    public Document (String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void print () {
        System.out.println("Printing document");
        System.out.println("Title: "+title);
        System.out.println("Content: "+content);

    }
}
