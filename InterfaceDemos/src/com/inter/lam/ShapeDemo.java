package com.inter.lam;

public class ShapeDemo {
    public static void main(String[] args) {
        IShape shape1 = new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Implementation for rectangle");
                System.out.println(x*y);
            }
        };
        shape1.area(100,200);
        IShape shape2 = new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Implementation of Triangle");
                System.out.println(x+y);
            }
        };
        shape2.area(150,300);
    }
}
