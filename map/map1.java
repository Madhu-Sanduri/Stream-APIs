package streams.map;

import streams.Employee;
import streams.Main;

import java.util.ArrayList;
import java.util.List;

//Using Streams, extract a list of all employee names from the data set.
public class map1 {
    public static void main(String[] args) {
        List<Employee> list = Main.setEmployees();

        List<String> list1=list.stream()
                .map(Employee::getName)
                .toList();
        System.out.println(list1);
    }
}
