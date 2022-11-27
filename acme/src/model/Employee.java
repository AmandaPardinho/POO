package model;

public abstract class Employee {
    protected int registryNumber;
    protected String name;

    public Employee(int registryNumber, String name) {
        super();
        this.registryNumber = registryNumber;
        this.name = name;
    }

    public abstract double calculateSalary();

    public int getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(int registryNumber) {
        this.registryNumber = registryNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
