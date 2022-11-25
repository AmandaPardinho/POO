package employee;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String showSalary(){
        return this.name + " R$ " + this.salary;
    }

    public double increaseSalary(double percent){
        return getSalary() + ((getSalary() * percent)/100);
    }
}
