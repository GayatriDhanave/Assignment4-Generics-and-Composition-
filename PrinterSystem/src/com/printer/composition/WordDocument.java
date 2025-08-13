package com.printer.composition;

public class WordDocument implements Document{
    private String title;
    private String content;

    public WordDocument (String title, String content) {
        this.title = title;
        this.content = content;
    }
    @Override
    public String getTitle () {
        return title;
    }

    @Override
    public String getContent () {
        return content;
    }

    @Override
    public void print () {
        System.out.println("Printing Word document");
        System.out.println("Title: "+title);
        System.out.println("Content: "+content);

    }
}
