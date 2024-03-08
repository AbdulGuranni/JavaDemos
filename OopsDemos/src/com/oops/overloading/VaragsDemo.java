package com.oops.overloading;

public class VaragsDemo {
    void calcSum(String name, int... marks ){
        System.out.println("welcome"+" "+name);
        int sum=0;
        for(int mark:marks)
            sum+=mark;
        System.out.println("sum "+" "+ sum);
    }

    void calcSum(String name){
        System.out.println("Hello "+" "+name);
    }

    public static void main(String[] args) {
        VaragsDemo demo = new VaragsDemo();
        demo.calcSum("Abdul",90,80,90);
        demo.calcSum("Gokul");
        demo.calcSum("Rahul",90,80);
    }

}
