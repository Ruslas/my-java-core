package lesson13.homework;

public class Report {
    public static void generateReport(Employee... employees) {
        for (Employee employee : employees) {
            System.out.printf("Emploee %-15s - %,.2f%n", employee.getFullName(), employee.getSalary());
        }
    }
}
