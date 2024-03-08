package com.oops.inheritance;

public class InherMain {
    public static void main(String[] args) {
        InEmployee inEmployee = new InEmployee("Ajay",1);
        inEmployee.getDetails();

        InManager inManager = new InManager("Bhimesh",1,2000);
        inManager.getDetails();
        inManager.printBonus(1000);
    }
}
