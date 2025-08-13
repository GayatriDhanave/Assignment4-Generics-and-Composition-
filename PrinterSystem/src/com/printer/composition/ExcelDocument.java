package com.printer.composition;

public class ExcelDocument implements Document{
    private String title;
    private String content;
    private int size;
    public ExcelDocument (String title, String content, int size) {
        this.title = title;
        this.content = content;
        this.size = size;
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
        System.out.println("Printing Excel document");
        System.out.println("Title: "+title);
        System.out.println("Content: "+content);
        System.out.println("Size: "+size);

    }
}
