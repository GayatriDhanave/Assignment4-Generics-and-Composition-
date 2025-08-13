package com.printer.inheritance;

public class Printer {

    private Document document;
    public void loadDocument (Document document) {
        this.document = document;
        System.out.println("Document loaded: "+document.title);
    }
    public void printDocument () {
        if(document != null) {
            document.print();
        } else {
            System.out.println("No document loaded");
        }
    }
}
