package streams.Aggregations;

import streams.Employee;
import streams.Main;

import java.util.List;
import java.util.stream.Collectors;

//Use Streams to calculate the average salary of all employees.
public class agg1 {

    public static void main(String[] args) {
        List<Employee> list= Main.setEmployees();
        System.out.println(
        list.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary)));
//        so
    }
}
