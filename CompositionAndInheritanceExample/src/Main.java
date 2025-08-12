import Composition.Engine;
import Inheritance.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {
        //Composition
        Engine engine = new Engine(100, "Diesel");
        Car car = new Car(1, 2010, 4, "SunRoof", engine);
        System.out.println(car);
    }
}