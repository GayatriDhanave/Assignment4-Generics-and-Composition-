package com.printer.composition;

public class PDFDocument implements Document{

    private String title;
    private String content;

    public PDFDocument (String title, String content) {
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
        System.out.println("Printing PDF document");
        System.out.println("Title: "+title);
        System.out.println("Content: "+content);

    }
}
