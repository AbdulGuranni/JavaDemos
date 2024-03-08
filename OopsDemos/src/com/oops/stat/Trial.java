package com.oops.stat;

public class Trial {
    static  int x=12;
    static int y=10;
    static {
        System.out.println("in static block1");
    }
    static {
        System.out.println("in static block2");
    }
    static void getMessage(){
        System.out.println("in static method");
        System.out.println("sum "+(x+y));
    }

    public static void main(String[] args) {
        System.out.println("in main");
        getMessage();
        System.out.println("sum "+(x+y));
    }
}
