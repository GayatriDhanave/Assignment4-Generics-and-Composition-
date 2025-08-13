import com.printer.inheritance.*;

public class Inheritance {
    public static void main (String[] args) {
        Printer printer = new Printer();
        PDFDocument pdfDocument = new PDFDocument("PDF Document", "This is a PDF document");
        printer.loadDocument(pdfDocument);
        printer.printDocument();
        System.out.println("--------------------------------");

        WordDocument wordDocument = new WordDocument("Word Document", "This is a Word document");
        printer.loadDocument(wordDocument);
        printer.printDocument();
        System.out.println("--------------------------------");

        ImageDocument imageDocument = new ImageDocument("Image Document", "This is an Image document");
        printer.loadDocument(imageDocument);
        printer.printDocument();
        System.out.println("--------------------------------");

        ExcelDocument excelDocument = new ExcelDocument("Excel Document", "This is an Excel document", 500);
        printer.loadDocument(excelDocument);
        printer.printDocument();
        System.out.println("--------------------------------");



    }

}
