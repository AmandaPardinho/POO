package model;

public class Contractor extends Employee{
    private double contractJob;

    public Contractor(int registryNumber, String name, double contractJob) {
        super(registryNumber, name);
        this.contractJob = contractJob;
    }

    public double getContractJob() {
        return contractJob;
    }

    public void setContractJob(double contractJob) {
        this.contractJob = contractJob;
    }

    @Override
    public double calculateSalary() {
        return contractJob;
    }
}
