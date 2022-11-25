package employee;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee("Amanda", 5000.00);

        System.out.println(employee.showSalary());
        System.out.println(employee.increaseSalary(50));
    }
}