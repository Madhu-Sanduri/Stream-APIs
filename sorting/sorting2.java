package streams.sorting;

import streams.Employee;
import streams.Main;

import java.util.Comparator;
import java.util.List;

public class sorting2 {


    public static void main(String[] args) {
        List<Employee> list= Main.setEmployees();

        list.stream().
                sorted(Comparator.comparing( Employee::getName).reversed())
                .limit(5)
                .forEach(System.out::println);
    }




}
