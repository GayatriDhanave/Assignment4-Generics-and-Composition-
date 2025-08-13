package com.printer.inheritance;

public class ImageDocument extends Document{
    public ImageDocument (String title, String content) {
        super(title, content);
    }

    @Override
    public void print () {
        System.out.println("Printing Image document");
        super.print();
    }
}
