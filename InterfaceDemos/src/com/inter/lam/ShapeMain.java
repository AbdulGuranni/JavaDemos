package com.inter.lam;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        IShape shape = new Rectangle();
        factory.printArea(shape,10,20);

        factory.printArea(new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("calculating area");
                System.out.println("Tri"+ (x*y*0.5));
            }
        }, 10, 40);

        factory.printArea((int x,int y)->{
            System.out.println(x*y);
        },2,4);
    }
}
