package com.company;

public class Bank {

    private String name;
    private double cashInVault;

    // "set" method for name
    public void setName(String nameOfBank) {
        name = nameOfBank;
    }
    // "get" method for name
    public String getName() {
        return name;
    }

    // "set" method for cashInVault
    public void setCashInVault(double amtOfCash) {
        cashInVault = amtOfCash;
    }
    // "get" method for cashInVault
    public double getCashInVault() {
        return cashInVault;
    }

    // method for deposit
    public void deposit (double amtOfDeposit) {
        cashInVault += amtOfDeposit;
        System.out.println("Branch: " + name + ", Amount deposited: " + amtOfDeposit + "\n" +
                "Total amount in bank after deposit: " + cashInVault);
    }


    // method for withdrawl
    public void withdrawl (double amtOfWithdrawl) {
        cashInVault -= amtOfWithdrawl;
        System.out.println("Branch: " + name + ", Amount withdrawn: " + amtOfWithdrawl + "\n" +
                "Total amount in bank after withdrawl: " + cashInVault);
    }
}
