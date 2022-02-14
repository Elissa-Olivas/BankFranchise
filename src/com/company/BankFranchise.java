package com.company;

public class BankFranchise {

    public static void main(String[] args) {

        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        bank1.setName("Chase");
        bank1.setCashInVault(100000);

        bank2.setName("ENT");
        bank2.setCashInVault(100000);


        bank1.deposit(100);
        bank1.withdrawl(15000);
        bank1.deposit(900);
        bank1.withdrawl(9500);

        bank2.deposit(12000);
        bank2.withdrawl(9000);
        bank2.deposit(950);
        bank1.withdrawl(1500);

    }
}
