package com.inter.extend;

public class CalcMain {
    public static void main(String[] args) {
        ICalculator calculator = new BasicCalculator();
        calculator.add(2,4);
        calculator.product(6,2);

        IScientific scientific  = new ScientificCalculator();
        scientific.add(5,7);
        scientific.product(9,5);
        scientific.square(4);
        scientific.cube(3);

    }
}
