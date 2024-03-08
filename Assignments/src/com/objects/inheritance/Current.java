package com.objects.inheritance;

public class Current extends Account{
    public Current(double balance) {
        super(balance);
    }
    void withdraw(double amount){
        double balanceAmount = balance-amount;
        System.out.println("Balance amount after withdraw from current account");
        balance = balanceAmount;
    }
    void deposit(double amount){
        double balanceAmount = balance+amount;
        System.out.println("Balance amount after deposit from current account");
        balance = balanceAmount;
    }
}
