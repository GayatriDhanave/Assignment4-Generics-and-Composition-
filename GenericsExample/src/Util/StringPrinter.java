package Util;

public class StringPrinter implements Processor<String> {
    @Override
    public void process (String item) {
        System.out.println("Processed String: " + item.toUpperCase());
    }
}
