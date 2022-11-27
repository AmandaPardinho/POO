package model;

public class BankAccount {
    protected String holderName;
    protected String cpf;
    protected int number;
    protected double balance;

    public BankAccount(String holderName, String cpf, int number, double balance) {
        super();
        this.holderName = holderName;
        this.cpf = cpf;
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public boolean withdraw(double value){
        if(balance >= value){
            balance -= value;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Name: " + holderName + ", " + "CPF: " + cpf + ", " + "Account Number: " + number + ", " + "Balance: " +
                balance;
    }

    public String HolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
