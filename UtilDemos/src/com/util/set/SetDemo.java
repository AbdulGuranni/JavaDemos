package com.util.set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        //Set<String> hashSet = new HashSet<>();
        //Set<String> hashSet = new LinkedHashSet<>();
        List<String> fruits = Arrays.asList("apple","orange");
        Set<String> newfruits = new HashSet<>(fruits);
        System.out.println(newfruits);
        Set<String> hashSet = new TreeSet<>();
        hashSet.add("apple");
        hashSet.add("pineapple");
        hashSet.add("orange");
        hashSet.add("Banana");
        hashSet.add("kiwi");
        hashSet.add("100");
        //hashSet.add(null);
        System.out.println(hashSet);
        for(String element:hashSet){
            System.out.println(element);
       }

    }
}
