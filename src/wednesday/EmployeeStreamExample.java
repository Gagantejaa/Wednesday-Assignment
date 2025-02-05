package wednesday;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeStreamExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Gagan", 24, 50000),
            new Employee("Chitti", 23, 60000),
            new Employee("Vijay", 40, 75000),
            new Employee("Nagesh", 36, 48000),
            new Employee("Emma", 32, 70000)
        );

        List<String> filteredNames = employees.stream()
            .filter(e -> e.getAge() > 30)
            .map(Employee::getName)
            .collect(Collectors.toList());

        double avgSalary = employees.stream()
            .filter(e -> e.getAge() > 30)
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0.0);

        System.out.println("Employees older than 30: " + filteredNames);
        System.out.println("Average Salary: " + avgSalary);
    }
}
