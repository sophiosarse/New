import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

//        // 2
//        System.out.println("Employees whose first names start with 'A':");
//        for (Employee employee : employeeList) {
//            if (employee.getFirstName().startsWith("A")) {
//                System.out.println(employee.getFirstName() + " " + employee.getLastName());
//            }
//        }
//
//
//        // 3
//        List<Employee> employeesJoinedIn2023 = employeeList.stream()
//                .filter(employee -> employee.getId().startsWith("2023"))
//                .collect(Collectors.toList());
//        System.out.println("\nEmployees who joined the company in 2023:");
//        for (Employee employee : employeesJoinedIn2023) {
//            System.out.println(employee.getFirstName() + " " + employee.getLastName());
//        }
//
//
//        // 4
//
//        Collections.sort(employeeList, (e1, e2) -> {
//            int nameComparison = e1.getFirstName().compareTo(e2.getFirstName());
//            if (nameComparison == 0) {
//                return Integer.compare(e1.getSalary(), e2.getSalary());
//            }
//            return nameComparison;
//        });
//
//        System.out.println("\nEmployees sorted by first name and salary:");
//        for (Employee employee : employeeList) {
//            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " - Salary: " + employee.getSalary());
//        }
    }
}