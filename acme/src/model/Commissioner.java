package model;

public class Commissioner extends Employee{
    private double baseSalary;
    private double commission;

    public Commissioner(int registryNumber, String name, double baseSalary, double commission) {
        super(registryNumber, name);
        this.baseSalary = baseSalary;
        this.commission = commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + ((baseSalary * commission) / 100);
    }
}
