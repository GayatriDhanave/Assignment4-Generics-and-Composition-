import com.printer.composition.*;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//    Composition
    public static void main (String[] args) {
        Printer printer = new Printer();
        Document pdfDocument = new PDFDocument("PDF Document", "This is a PDF document");
        printer.loadDocument(pdfDocument);
        printer.printDocument();
        System.out.println("--------------------------------");

        Document wordDocument = new WordDocument("Word Document", "This is a Word document");
        printer.loadDocument(wordDocument);
        printer.printDocument();
        System.out.println("--------------------------------");

        Document imageDocument = new ImageDocument("Image Document", "This is an Image document");
        printer.loadDocument(imageDocument);
        printer.printDocument();
        System.out.println("--------------------------------");

        Document excelDocument = new ExcelDocument("Excel Document", "This is an Excel document", 500);
        printer.loadDocument(excelDocument);
        printer.printDocument();
        System.out.println("--------------------------------");



    }
}

//        Scanner sc = new Scanner(System.in);
//        Printer printer = new Printer();
//        Document document;
//
//
//        int ch=0;
//        while (ch!=5){
//        System.out.println("1. PDF Document\n2. Word Document\n3. Image Document\n4. Excel Document\n5. Exit\nEnter your choice: ");
//        ch = sc.nextInt();
//            switch (ch) {
//        case 1:
//        System.out.println("Enter title: ");
//        String title = sc.next();
//                    System.out.println("Enter content: ");
//        String content = sc.next();
//        document = new PDFDocument(title, content);
//                    printer.loadDocument(document);
//                    printer.printDocument();
//                    System.out.println("--------------------------------");
//                    break;
//                            case 2:
//                            System.out.println("Enter title: ");
//        title = sc.next();
//                    System.out.println("Enter content: ");
//        content = sc.next();
//        document = new WordDocument(title, content);
//                    printer.loadDocument(document);
//                    printer.printDocument();
//                    System.out.println("--------------------------------");
//                    break;
//                            case 3:
//                            System.out.println("Enter title: ");
//        title = sc.next();
//                    System.out.println("Enter content: ");
//        content = sc.next();
//        document = new ImageDocument(title, content);
//                    printer.loadDocument(document);
//                    printer.printDocument();
//                    System.out.println("--------------------------------");
//                    break;
//                            case 4:
//                            System.out.println("Enter title: ");
//        title = sc.next();
//                    System.out.println("Enter content: ");
//        content = sc.next();
//                    System.out.println("Enter size: ");
//        int size = sc.nextInt();
//        document = new ExcelDocument(title, content, size);
//                    printer.loadDocument(document);
//                    printer.printDocument();
//                    System.out.println("--------------------------------");
//                    break;
//                            case 5:
//                            System.out.println("Exiting...");
//                    break;
//        default:
//        System.out.println("Invalid choice");
//                    break;
//                            }
//                            }