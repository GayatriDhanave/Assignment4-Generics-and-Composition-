package com.printer.inheritance;

public class ExcelDocument extends  Document {

    private int size;
    public ExcelDocument (String title, String content, int size) {
        super(title, content);
        this.size = size;
    }
    @Override
    public void print () {
        System.out.println("Printing Excel document");
        super.print();
        System.out.println("Size: "+size);
    }

}
