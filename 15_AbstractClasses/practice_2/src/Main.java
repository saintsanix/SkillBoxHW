package src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        List<Employee> workers = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            company.hire(new Operator(30000));
        }
        for (int i = 0; i < 80; i++) {
            company.hire(new Manager(40000));
        }
        for (int i = 0; i < 10; i++) {
            company.hire(new TopManager(50000, company));
        }
        company.hireAll(workers);

        printTopLowSalary(company);
        List<Employee> employees = company.getEmployees();
        for (int i = 0; i < 135; i++) {
            company.fire(employees.get(i));
        }
        System.out.println("\nУволили 135 сотрудников\n");
        printTopLowSalary(company);
    }

    private static void printTopLowSalary(Company company) {
        List<Employee> topSalaryStaff = company.getTopSalaryStaff(10);
        System.out.println("Список 10 самых высоких зарплат:");
        for (Employee e : topSalaryStaff) {
            System.out.println(e.getMonthSalary());
        }

        List<Employee> lowSalaryStaff = company.getLowesSalaryStaff(10);
        System.out.println("Список 10 самых низких зарплат:");
        for (Employee e : lowSalaryStaff) {
            System.out.println(e.getMonthSalary());
        }
    }
}
