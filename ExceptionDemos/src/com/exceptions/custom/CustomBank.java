package com.exceptions.custom;

public class CustomBank {
    double balance;

    public CustomBank(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws OutOfLimitsException,NegativeBalanceException{
        System.out.println("In withdraw method");
        try {
            if(balance-amount<=0)
                throw new NegativeBalanceException("balance is negative");
            if(amount>1000)
                throw new OutOfLimitsException("Limits excedded");
        } catch (NegativeBalanceException e) {
            System.out.println("exception.."+e.getMessage());
            throw new RuntimeException(e);
        } catch (OutOfLimitsException e) {
            System.out.println("exception.."+e.getMessage());
            throw new RuntimeException(e);
        }finally {
            System.out.println("close db");
        }
        System.out.println("work done");
    }
}
