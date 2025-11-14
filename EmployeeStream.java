// EmployeeStream.java
import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + department + ", ₹" + salary + ")";
    }
}

public class EmployeeStream {
    public static void main(String[] args) {
        // Step 1: Create a list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Asha Rao", "IT", 75000),
            new Employee("Ravi Kumar", "HR", 55000),
            new Employee("Deepa Nair", "IT", 82000),
            new Employee("Sandeep Joshi", "Finance", 60000),
            new Employee("Sunita Sharma", "IT", 91000)
        );

        // Step 2: Use Stream API to filter, map, and collect names of IT employees
        List<String> itEmployeeNames = employees.stream()
            .filter(emp -> emp.getDepartment().equalsIgnoreCase("IT"))
            .map(Employee::getName)
            .collect(Collectors.toList());

        // Step 3: Display the resulting list
        System.out.println("Employees in IT Department:");
        itEmployeeNames.forEach(System.out::println);
    }
}
