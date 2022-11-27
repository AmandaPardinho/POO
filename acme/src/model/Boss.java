package model;

public class Boss extends Employee{
    private double baseSalary;
    private double additionalPay;
    private double suitBenefit;

    public Boss(int registryNumber, String name, double baseSalary, double additionalPay, double suitBenefit) {
        super(registryNumber, name);
        this.baseSalary = baseSalary;
        this.additionalPay = additionalPay;
        this.suitBenefit = suitBenefit;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getAdditionalPay() {
        return additionalPay;
    }

    public void setAdditionalPay(double additionalPay) {
        this.additionalPay = additionalPay;
    }

    public double getSuitBenefit() {
        return suitBenefit;
    }

    public void setSuitBenefit(double suitBenefit) {
        this.suitBenefit = suitBenefit;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + ((baseSalary * additionalPay) / 100) + suitBenefit;
    }
}
