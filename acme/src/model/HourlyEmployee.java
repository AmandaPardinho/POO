package model;

public class HourlyEmployee extends Employee{
    private int numberHours;
    private double hourValue;

    public HourlyEmployee(int registryNumber, String name, int numberHours, double hourValue) {
        super(registryNumber, name);
        this.numberHours = numberHours;
        this.hourValue = hourValue;
    }

    public int getNumberHours() {
        return numberHours;
    }

    public void setNumberHours(int numberHours) {
        this.numberHours = numberHours;
    }

    public double getHourValue() {
        return hourValue;
    }

    public void setHourValue(double hourValue) {
        this.hourValue = hourValue;
    }

    @Override
    public double calculateSalary() {
        return numberHours * hourValue;
    }
}
