package streams.sorting;

import streams.Employee;
import streams.Main;

import java.util.Comparator;
import java.util.List;
//How would you sort the employees by salary in descending order using Streams?
public class sorting1 {
    public static void main(String[] args) {
        List<Employee> list= Main.setEmployees();

        list.stream().
                sorted(Comparator.comparing( Employee::getId).reversed())
                .forEach(System.out::println);
    }
}
