package classes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

    public static void main (String[] args) {
        List<Employee> employeeList= Arrays.asList(
          new Employee("Amann",12),
          new Employee("Yash", 13),
          new Employee("Prince",  34),
          new Employee("Naveen", 23)
        );
        //  Sort Employees by Age
        employeeList.stream()
                .sorted(Comparator.comparing(e->e.getAge()))
                .forEach(s-> System.out.println(s.getName()+" -> "+s.getAge()));


        //  Highest Age
        Employee maxAge=employeeList.stream().max(Comparator.comparing(e->e.getAge())).orElse(null);
        System.out.println("Max Age :"+maxAge.getName() +" "+maxAge.getAge());
    }
}
