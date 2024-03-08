package com.inter.extend;

public class BasicCalculator implements ICalculator {
    @Override
    public void add(int x, int y) {
        int add = x+y;
        System.out.println(add);
    }

    @Override
    public void product(int x, int y) {
        int multiply = (x*y);
        System.out.println(multiply);
    }
}
