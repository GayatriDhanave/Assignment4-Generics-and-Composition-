import com.calculator.Calculator;

public class Main {
    public static void main (String[] args) {

        Calculator<Integer> calculator = new Calculator<>();
        System.out.println("Integer Calculator: ");
        System.out.println("Addition: " + calculator.add(10, 2));
        Integer add = calculator.add(10, 2);
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multiplication: " + calculator.multiply(15, 6));
        System.out.println("Division: " + calculator.divide(80, 2));
        System.out.println("--------------------------------");

        System.out.println("Double Calculator: ");
        Calculator<Double> calculator2 = new Calculator<>();
        System.out.println("Addition: " +calculator2.add(10.5, 2.5));
        System.out.println("Subtraction: " + calculator2.subtract(10.5, 5.5));
        System.out.println("Multiplication: " + calculator2.multiply(15.5, 6.5));
        System.out.println("Division: " + calculator2.divide(80.5, 2.5));
        System.out.println("--------------------------------");

        System.out.println("Float Calculator: ");
        Calculator<Float> calculator3 = new Calculator<>();
        System.out.println("Addition: " + calculator3.add(10.5f, 2.5f));
        System.out.println("Subtraction: " + calculator3.subtract(10.5f, 5.5f));
        System.out.println("Multiplication: " + calculator3.multiply(15.5f, 6.5f));
        System.out.println("Division: " + calculator3.divide(80.5f, 2.5f));
        System.out.println("--------------------------------");

        System.out.println("Long Calculator: ");
        Calculator<Long> calculator4 = new Calculator<>();
        System.out.println("Addition: " + calculator4.add(10L, 2L));
        System.out.println("Subtraction: " + calculator4.subtract(10L, 5L));
        System.out.println("Multiplication: " + calculator4.multiply(15L, 6L));
        System.out.println("Division: " + calculator4.divide(80L, 2L));
        System.out.println("--------------------------------");
    }
}