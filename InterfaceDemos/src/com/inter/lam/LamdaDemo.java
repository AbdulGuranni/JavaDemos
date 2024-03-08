package com.inter.lam;

public class LamdaDemo {
    public static void main(String[] args) {
        IGreeter greeter = (me)-> System.out.println(me);
        greeter.greetMessage("Welcome");

        greeter = message -> System.out.println(message+"!!!");
        greeter.greetMessage("Good morning");
    }
}
