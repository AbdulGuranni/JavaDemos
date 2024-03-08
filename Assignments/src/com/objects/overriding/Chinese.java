package com.objects.overriding;

public class Chinese extends Menu{
    void showItems(String type){
        if(type.equals("Starters")){
            System.out.println("Chinese Starters Items");
            System.out.println("1.Soup"+" "+"2.Gobi"+" "+"3.Manchurian");
        }
        if(type.equals("Lunch")){
            System.out.println("Chinese Lunch Items");
            System.out.println("1.Gobi Rice"+" "+"2.Gobi Manchurian"+" "+"3.Corn Rice");
        }
        if(type.equals("Desert")){
            System.out.println("1.Chinese Sweet"+" "+"2.Special Chinerse Sweet");
        }
    }
    void printGames(){
        System.out.println("Board Games Available");
    }
}

