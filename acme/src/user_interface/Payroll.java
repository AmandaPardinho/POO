package user_interface;

import model.*;

public class Payroll {
    public static void main(String[] args) {
        Employee e1, e2, e3, e4;

        e1 = new Boss(999, "Amanda", 4000.00, 500.00, 500.00);
        e2 = new Commissioner(555, "João", 3000.00, 200.00);
        e3 = new HourlyEmployee(333, "Paola", 160, 50.00);
        e4 = new Contractor(111, "Pedro", 5000.00);

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
        e4.calculateSalary();

        System.out.println(e1.getRegistryNumber() + " - " + e1.getName() + " - " + "R$ " + e1.calculateSalary());
        System.out.println(e2.getRegistryNumber() + " - " + e2.getName() + " - " + "R$ " + e2.calculateSalary());
        System.out.println(e3.getRegistryNumber() + " - " + e3.getName() + " - " + "R$ " + e3.calculateSalary());
        System.out.println(e4.getRegistryNumber() + " - " + e4.getName() + " - " + "R$ " + e4.calculateSalary());
    }
}