package stream_example;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOperation {

    public static void main (String[] args) {

        List< Employee > employeeList = Arrays.asList(
                new Employee("Rohan", 22000.0, "HR"),
                new Employee("Amit", 25000.0, "IT"),
                new Employee("Neha", 24348.0, "Finance"),
                new Employee("Priya", 26284.0, "HR"),
                new Employee("Rahul", 28287.0, "IT"),
                new Employee("Sneha", 23000.0, "Finance"),
                new Employee("Vikas", 30239.0, "Admin"),
                new Employee("Anjali", 27374.0, "HR"),
                new Employee("Karan", 29235.0, "IT"),
                new Employee("Pooja", 21246.0, "Finance"),
                new Employee("Arjun", 314985.0, "Admin"),
                new Employee("Meena", 22023.0, "HR"),
                new Employee("Suresh", 35024.0, "IT"),
                new Employee("Kavita", 28057.0, "Finance"),
                new Employee("Ramesh", 40087.0, "Admin"),
                new Employee("Divya", 26056.0, "HR"),
                new Employee("Manoj", 33384.0, "IT"),
                new Employee("Nisha", 24475.0, "Finance"),
                new Employee("Deepak", 36903.0, "Admin"),
                new Employee("Swati", 27947.0, "HR")
        );

        for ( Employee list : employeeList ) {
            System.out.println(list);
        }

        System.out.println("-- Display Department in ascending order by their total salary---");
        Map< String, Double > departmentOrderByAsc = employeeList.stream()
                .filter(e -> e.getSalary() != null && e.getDepartment() != null)
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        System.out.println(departmentOrderByAsc);

        // Partitioning employee by their salary above 25K
        Map< Boolean, List< Employee > > partitioningEmployee = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 25000));

        // Group employees by department
        Map< String, List< Employee > > groupEmployee = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.print("Group employees by department :" + groupEmployee);

        //Find highest salary per department
        Map< String, Optional< Employee > > highestSalary = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getDepartment))));

        System.out.println("Find highest salary per department :" + highestSalary);

        // Convert List to Map
        Map< Double, String > convertListToMap = employeeList.stream()
                .collect(Collectors.toMap(Employee::getSalary, Employee::getName));

        System.out.println("Convert List to Map :" + convertListToMap);
    }
}
