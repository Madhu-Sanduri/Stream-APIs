package streams.Filter;

import streams.Employee;
import streams.Main;


//Write a Stream query to get a list of employees whose designation is "Senior Engineer".

import java.util.List;

public class filtering2 {
    public static void main(String[] args) {
        List<Employee> list = Main.setEmployees();

        list.stream()
                .filter(employee -> employee.getDesignation().equals("Senior Engineer"))
                .forEach(System.out::println);
    }
}
