import java.util.*;
import java.util.stream.*;

public class EmployeeFilter {
    record Employee(String name, int age, double salary) {}

    public static List<Employee> filterHighEarners(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.salary() > 80000)
                .sorted(Comparator.comparing(Employee::salary).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Amit", 30, 90000),
                new Employee("Ravi", 25, 75000),
                new Employee("Priya", 35, 120000),
                new Employee("Sita", 28, 95000)
        );

        filterHighEarners(employees).forEach(System.out::println);
    }
}
