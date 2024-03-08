package com.inter.lam;

public class MenuLambda {
    public static void main(String[] args) {
        IMenu menu =()-> {
            System.out.println("1. Gobi  2.Manchurian");
            System.out.println("1.Sweet 2.Dessert ");

        };
        menu.showMenus();

        menu= ()->{
            System.out.println("1.Rice ");
        };
    }
}
