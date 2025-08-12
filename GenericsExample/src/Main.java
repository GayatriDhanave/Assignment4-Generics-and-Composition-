import Util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {
//        Calulator<Integer> calc = new Calculator<>();//generic class
//        System.out.println(calc.sum(10, 20));
//        System.out.println(calc.sub(10, 20));

        Pair<String, Integer> pair = new Pair<String, Integer>("Nia", 100); //multiple type parameters
        System.out.println(pair);
        Pair<Integer, String> pair2 = new Pair<Integer, String>(101, "Nia");
        System.out.println(pair2);

        List<String> list = Arrays.asList("Nia", "Jiya", "Pia");
        Utils.printList(list);// generic method
        List<Double> list2 = Arrays.asList(10.5, 20.5, 30.5);
        Utils.printList(list2);
        System.out.println("Sum of numbers: "+Utils.sumNumbers(list2));//upper bound wildcard

        List<Number> nums = new ArrayList<>();//lower bound wildcard
        Utils.addIntegers(nums);
        System.out.println(nums);

        Processor<String> processor = new StringPrinter();//generic interface
        processor.process("Hello World");
    }
}