package com.objects.inheritance;

public class Savings extends Account{
    public Savings(double balance) {
        super(balance);
    }
    void withdraw(double amount){
        double balanceAmount = balance-amount;
        System.out.println("Balance amount after withdraw from savings account");
        balance = balanceAmount;
    }
    void deposit(double amount){
        double balanceAmount = balance+amount;
        System.out.println("Balance amount after deposit from savings account");
        balance = balanceAmount;
    }
}
