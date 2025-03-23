package streams;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> list = setEmployees();

    }

    public static List<Employee> setEmployees(){

            ArrayList<Employee> list = new ArrayList<>();
            Employee e1=new Employee(1,"Madhu",25722.2,"Senior Engineer");
            Employee e2 = new Employee(2, "Rehan", 20000.0, "Software Engineer");
            Employee e3 = new Employee(3, "Kiran", 28000.0, "Team Lead");
            Employee e4 = new Employee(4, "John", 25000.0, "Senior Engineer");
            Employee e5 = new Employee(5, "David", 22000.0, "Software Engineer");
            Employee e6 = new Employee(6, "Sara", 30000.0, "Manager");
            Employee e7 = new Employee(7, "Peter", 26000.0, "Senior Engineer");
            Employee e8 = new Employee(8, "Emily", 24000.0, "Software Engineer");
            Employee e9 = new Employee(9, "Michael", 29000.0, "Team Lead");
            Employee e10 = new Employee(10, "Jessica", 27000.0, "Senior Engineer");
            Employee e11 = new Employee(11, "Mexui", 127000.0, "President");
            list.add(e11);
            list.add(e1);
            list.add(e2);
            list.add(e3);
            list.add(e4);
            list.add(e5);
            list.add(e6);
            list.add(e7);
            list.add(e8);
            list.add(e9);
            list.add(e10);

            return list;
    }
}
