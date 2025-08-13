package com.printer.inheritance;

public class PDFDocument extends Document{
    public PDFDocument (String title, String content) {
        super(title, content);
    }
    @Override
    public void print () {
        System.out.println("Printing PDF document");
       super.print();

    }
}
