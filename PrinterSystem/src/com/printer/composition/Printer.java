package com.printer.composition;

public class Printer {
    private Document document;

    public void loadDocument (Document document) {
        this.document = document;
    }
    public void printDocument () {
        if(document != null) {
            document.print();
        } else {
            System.out.println("No document loaded");
        }
    }
}
