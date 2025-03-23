package streams.map;


//Create a Stream pipeline to convert all employee salaries into a list of salaries increased by 10%.


import streams.Employee;
import streams.Main;

import java.util.List;

public class map2 {
    public static void main(String[] args) {
        List<Employee> list= Main.setEmployees();

        list.stream()
                .filter(x ->x.getSalary()>3000)
                .map(x -> x.getSalary()*1.10)
                .forEach(System.out::println);
    }
}
