package employee;

public class Empregado {

    private String name;
    private double salary;

    public Empregado(String name, double salary){
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

    public double showSalary(){
        return getSalary();
    }

    public void increaseSalary(double percent){
        double increaseSalary = getSalary() - ((getSalary() * percent)/100);
    }
}
