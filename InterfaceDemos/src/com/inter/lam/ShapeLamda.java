package com.inter.lam;

public class ShapeLamda {
    public static void main(String[] args) {
        IShape ishape = (int x,int y)->{
            System.out.println(x*y);
        };
        ishape.area(10,20);

        ishape =(x,y)-> System.out.println(0.5*x*y);
        ishape.area(15,30);
    }
}
