import com.entity.Employee;
import com.service.Service;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {
        Service service=new Service();
        List<Employee> allEmployees = service.findAllEmployees();
        for (Employee e:allEmployees){
            System.out.println(e);
        }
        System.out.println(service.getEmployeeById(2));



    }
}