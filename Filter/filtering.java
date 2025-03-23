package streams.Filter;

//How would you use Streams to find all employees with a salary greater than 25,000?

import streams.Employee;
import streams.Main;

import java.util.List;

public class filtering {
    public static void main(String[] args) {
        List<Employee> list = Main.setEmployees();
//        System.out.println(list);
        list.stream()
                .filter(employee -> employee.getSalary()>25000)
                .forEach(System.out::println);

    }
}
