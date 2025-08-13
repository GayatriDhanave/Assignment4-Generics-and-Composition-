import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctiionalInterfaceExample {
    public static void main (String[] args) {
        Function<String,Integer> len = str->str.length(); //used to process input and give output
        System.out.println("Length of COVORO: "+len.apply("COVORO"));

        Predicate<Integer> isEven=n->n%2==0;// takes input and returns boolean value
        System.out.println("Number 20 is even? "+isEven.test(20));

        Consumer<String> print= msg-> System.out.println("Message: "+msg);//takes input and performs certain operations
        print.accept("Consumer takes input and returns nothing"); // returns nothing

        Supplier<Double> randomSupplier=()->Math.random();
        System.out.println("Random number: "+ randomSupplier.get());

//        Method referencing
        List<String> progLang= Arrays.asList("C", "C++", "Python", "Java");
        progLang.forEach(System.out::println);

    }
}




// progLang.forEach(lang->sop(name));
//method reference anotther way str->str.length
//        supplier doesnt takes any input but returns object(data) based on given operation
