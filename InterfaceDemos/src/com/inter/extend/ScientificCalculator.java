package com.inter.extend;

public class ScientificCalculator extends BasicCalculator implements IScientific {



    @Override
    public void square(int x) {
        int square = x*x;
        System.out.println(square);
    }

    @Override
    public void cube(int x) {
        int cube = x*x*x;
        System.out.println(cube);
    }
}
