package lesson13.homework;

public class FullReport {
    public static void generateReport(Employee... employees) {
        for (Employee employee : employees) {
            System.out.printf("Emploee %-15s - %,.2f - %s%n",
                    employee.getFullName(), employee.getSalary(), employee.getSalaryDate());
        }
    }
}
