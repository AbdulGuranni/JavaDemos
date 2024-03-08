package com.exceptions.custom;

public class VoyaATM {
    public static void main(String[] args) throws OutOfLimitsException,NegativeBalanceException {
        CustomBank bank = new CustomBank(-1);
        bank.withdraw(2000);
    }
}
