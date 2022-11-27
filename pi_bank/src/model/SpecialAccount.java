package model;

public class SpecialAccount extends BankAccount{
    private double specialLimit;

    public SpecialAccount(String holderName, String cpf, int number, double balance, double specialLimit) {
        super(holderName, cpf, number, balance);
        this.specialLimit = specialLimit;
    }

    @Override
    public boolean withdraw(double value){
         if(super.balance + this.specialLimit >= value){
             super.balance -= value;
             return true;
         }
         return false;
    }

    @Override
    public String toString(){
        return super.toString() + ", " + "Special limit: " + this.specialLimit;
    }

    public double getSpecialLimit() {
        return specialLimit;
    }

    public void setSpecialLimit(double specialLimit) {
        this.specialLimit = specialLimit;
    }
}
