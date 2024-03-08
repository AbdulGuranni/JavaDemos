package com.objects.inheritance;
import java.util.Scanner;
public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank(120);

        while(true){
            System.out.println("Enter your money");
            double amount = sc.nextDouble();
            System.out.println("Enter the choice to deposit 1  or withdraw 2");
            int choice = sc.nextInt();
            switch(choice){
                case 1: System.out.println("Deposit your money");
                        bank.deposit(amount);
                        System.out.println(bank.getBalance());
                        break;
                case 2: System.out.println("Withdraw your money");
                        bank.withdraw(amount);
                        System.out.println(bank.getBalance());
                        break;
            }
        }

    }
}
