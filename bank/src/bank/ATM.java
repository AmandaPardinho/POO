package bank;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount;
        bankAccount = new BankAccount(123456789, 0, "Amanda", "35689614823", 100.00);
        int functionAtm;
        int value;
        do {
            System.out.println("""
                    Choose an option:
                        1 - Account information;
                        2 - Deposit;
                        3 - Withdraw;
                        4 - Exit.
                    """);

            functionAtm = scanner.nextInt();

            switch (functionAtm) {
                case 1:
                    System.out.println(bankAccount.showAccount());
                    break;
                case 2:
                    System.out.println("Enter the amount to be deposited:");
                    value = scanner.nextInt();
                    System.out.println(bankAccount.depositAmount(value));
                    break;
                case 3:
                    System.out.println("Enter the amount to be withdrawn:");
                    value = scanner.nextInt();
                    boolean withdraw = bankAccount.withdraw(value);
                    if(withdraw){
                        System.out.println("Withdrawal effected");
                    }else{
                        System.out.println("Withdrawal cannot be performed");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM");
                    break;
                default:
                    System.out.println("Option not available");

            }
        } while (functionAtm != 4);

        scanner.close();
    }
}
