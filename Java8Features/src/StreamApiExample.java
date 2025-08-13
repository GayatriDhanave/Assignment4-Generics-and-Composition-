import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApiExample {
    public static void main (String[] args) {
        List<Employee> empList = Arrays.asList(new Employee("riya", 26),
                new Employee("piya", 28),
                new Employee("jiya", 34),
                new Employee("priya", 36));

        empList.stream()
                .filter(emp->emp.getAge()>30)
                .map(emp->emp.getName().toUpperCase())
                .forEach(System.out::println);
    }
}
