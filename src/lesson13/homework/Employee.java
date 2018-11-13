package lesson13.homework;

import java.time.LocalDate;

public class Employee {
    private String fullName;
    private double salary;
    private LocalDate salaryDate;

    public Employee(String fullName, double salary, LocalDate salaryDate) {
        if (salary > 0) {
            this.fullName = fullName;
            this.salary = salary;
            this.salaryDate = salaryDate;
        } else {
            System.out.println("Salary must be positive!");
        }
    }

    public Employee(String fullName, double salary) {
        if (salary > 0) {
            this.fullName = fullName;
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive!");
        }
    }

    public Employee() {
    }

    public LocalDate getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(LocalDate salaryDate) {
        this.salaryDate = salaryDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else System.out.println("Salary must be positive!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        if (fullName != null ? !fullName.equals(employee.fullName) : employee.fullName != null) return false;
        return salaryDate != null ? salaryDate.equals(employee.salaryDate) : employee.salaryDate == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fullName != null ? fullName.hashCode() : 0;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (salaryDate != null ? salaryDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", salaryDate=" + salaryDate +
                '}';
    }
}
