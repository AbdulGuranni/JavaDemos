package com.objects.overriding;
public class Restaurant {
    public static void main(String[] args) {

        Menu menu = new Chinese();
        menu.showItems("breakfast");

        menu = new Indian();
        menu.showItems("breakfast");

        Chinese chinese = (Chinese)menu;
        chinese.printGames();
    }
}
