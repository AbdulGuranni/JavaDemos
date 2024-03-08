package com.objects.inheritance;

public class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount){
        double balanceAmount = balance-amount;
        System.out.println("Balance amount after withdraw");
        balance = balanceAmount;
    }
    void deposit(double amount){
        double balanceAmount = balance+amount;
        System.out.println("Balance amount after deposit");
        balance = balanceAmount;
    }

    double getBalance(){
        return balance;
    }
}
