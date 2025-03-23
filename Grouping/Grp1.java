package streams.Grouping;


import streams.Employee;
import streams.Main;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

//Write a Stream query to group employees by their designation
// (e.g., "Senior Engineer", "Software Engineer", etc.) and return a Map.
public class Grp1 {
    public static void main(String[] args) {
        List<Employee> list= Main.setEmployees();
        Map<String,List<Employee>> listMap= list.stream()
                .collect(Collectors.groupingBy(Employee::getDesignation));

        listMap.forEach((designation, employees) ->
                System.out.println(designation + ": " + employees));
    }


}
