package com.objects.overriding;

public class Indian extends Menu{
    void showItems(String type){
        if(type.equals("Starters")){
            System.out.println("Indian Starters Items");
            System.out.println("1.Soup"+" "+"2.Pani puri"+" "+"3.Sukka");
        }
        if(type.equals("Lunch")){
            System.out.println("Indian Lunch Items");
            System.out.println("1.Palav Rice"+" "+"2.Biriyani"+" "+"3.Roti");
        }
        if(type.equals("Desert")){
            System.out.println("1.Gulab Jamun"+" "+"2.Rasagulla");
        }
    }
}
