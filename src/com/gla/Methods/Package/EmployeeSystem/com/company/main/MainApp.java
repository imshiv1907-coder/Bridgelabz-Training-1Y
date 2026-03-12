package com.company.main;

import com.company.hr.Employee;
import com.company.payroll.*;

public class MainApp {
    public static void main(String[] args) {
        Employee e = new Employee(1,"Ravi","IT",50000);
        Payroll p = new Payroll();

        double salaryWithBonus = p.calculateBonus(e);

        System.out.println("Employee: " + e.getName());
        System.out.println("Salary After Bonus: " + salaryWithBonus);
    }
}