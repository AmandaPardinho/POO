package app;

import model.BankAccount;
import model.SpecialAccount;

public class PIBank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Amanda", "55588877711", 963741, 200.00);
        //The declaration is important, but what defines the behavior is the instantiation
        BankAccount b2 = new SpecialAccount("Lara", "44400066677", 147369, 500.00,
                500.00);

        System.out.println(b1);
        System.out.println(b2);

        b1.withdraw(80.00);
        b2.withdraw(580.00);

        System.out.println(b1);
        System.out.println(b2);

    }
}