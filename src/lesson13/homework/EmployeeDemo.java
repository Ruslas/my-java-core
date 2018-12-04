package lesson13.homework;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rovikov Rei", 300.456);
        Employee e2 = new Employee("Pichikov Ben", 400.123);
        Employee e3 = new Employee("Temurov Noy", 500.897);
        Employee e4 = new Employee("Kun Lee", 1000.332);
        Employee e5 = new Employee("Rovnoy Leonid", 390.567);
        Employee e6 = new Employee("Luy Kan", 350.145);
        Employee e7 = new Employee("Jolie Nikol", 550.718);
        Employee[] employees = {e1, e2, e3, e4, e5, e6, e7};
        Report.generateReport(employees);
        Report.generateReportFile("Report_first", employees);
    }
}
