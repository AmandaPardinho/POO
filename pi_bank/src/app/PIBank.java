package app;

import model.BankAccount;
import model.SpecialAccount;

public class PIBank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Amanda", "55588877711", 963741, 200.00);
        SpecialAccount sA1 = new SpecialAccount("Lara", "44400066677", 147369, 500.00,
                500.00);

        System.out.println(b1);
        System.out.println(sA1);

    }
}