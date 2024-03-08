package com.util.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;

public class CheckDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Grapes");
        fruits.add("Mango");
        fruits.add("Bananas");
        fruits.add("Orange");
        fruits.add("Guava");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println("***********************************");
        List<String> list2 = new ArrayList<>();
        for(String fruit:fruits){
            list2.add(fruit);
            System.out.println(list2);
            if(fruit.contains("Grapes")){
                System.out.println("List2: "+list2);
                System.out.println("Fruits available");
            }
        }
    }
}
