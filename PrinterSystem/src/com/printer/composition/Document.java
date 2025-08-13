package com.printer.composition;

public interface Document {

    public String getTitle();
    public String getContent();
    public void print();
}

//Assignment: Design a Printer system
//Scenario : You are tasked with creating a Printer system that can print different types of documents — for example:
//PDFDocument
//WordDocument
//ImageDocument
//
//The printer should:
//Load a document
//Print the document
//
//Requirements
//A Document should have: Title and Content
//A print() method that outputs its contents to the console
//A Printer should be able to handle different document types.
//
//Step I : Design the System using both Conposition and Inheritance
//Step II : Add a new document type ExcelDocument which also have Size in both approach
//Step III : Compare the effort required in both cases and suggest the better approach