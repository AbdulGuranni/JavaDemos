package com.inter.lam;

public class CalcLamda {
    public static void main(String[] args) {
        IMyCalculator myCalculator = (x,y)-> x+y;
        System.out.println("Add: "+myCalculator.calculator(10,20));
        myCalculator = (x,y)-> x*y;
        System.out.println("Product: "+myCalculator.calculator(5,2));
        myCalculator = (x,y)-> x-y;
        System.out.println("Sub: "+myCalculator.calculator(10,8));
        myCalculator = (x,y)-> x/y;
        System.out.println("Div: "+myCalculator.calculator(10,5));
        myCalculator = (x,y)->x*x;
        System.out.println("Sqr: "+myCalculator.calculator(2,3));
    }
}
