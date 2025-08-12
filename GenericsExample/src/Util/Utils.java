package Util;

import java.util.List;

public class Utils {
    public static <T> void printList(List<T> list){
        for (T item : list){
            System.out.println(item);
        }
    }

    public static double sumNumbers(List<? extends  Number> list){ //upper bound wildcard
        double sum = 0;
        for (Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void addIntegers(List<? super Integer> list){ //lower bound wildcard
        list.add(120);
        list.add(150);
        list.add(160);
    }
}
