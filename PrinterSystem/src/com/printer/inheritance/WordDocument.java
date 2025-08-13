package com.printer.inheritance;

public class WordDocument extends  Document {
    public WordDocument (String title, String content) {
        super(title, content);
    }
    @Override
    public void print () {
        System.out.println("Printing Word document");
        super.print();
    }
}
