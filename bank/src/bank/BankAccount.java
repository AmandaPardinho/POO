package bank;

public class BankAccount {
    private int accountNumber;
    private int digit;
    private String holderName;
    private String cpf;
    private double balance;

    public BankAccount(int accountNumber, int digit, String holderName, String cpf, double balance) {
        this.accountNumber = accountNumber;
        this.digit = digit;
        this.holderName = holderName;
        this.cpf = cpf;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    public String getHolderName() {
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

    public double getBalance() {
        return balance;
    }

    public double depositAmount(double value){
        return this.balance += value;
    }

    public boolean withdraw(double value){
        if(balance >= value){
            balance -= value;
            return true;
        }else{
            return false;
        }
    }

    public String showAccount(){
        return "Account number: " + accountNumber + ", " + "Digit: " + digit + ", " + "Holder's name: " + holderName +
                ", " + "CPF: " + cpf + ", " + String.format("Balance: R$ %.2f", balance);
    }
}