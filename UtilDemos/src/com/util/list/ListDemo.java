package com.util.list;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("java");
        list.add("100.9");
        list.add("spring");
        list.add("angular");
        list.add("maven");
        System.out.println(list);
        list.set(1,"priya");
        System.out.println(list.size());

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println();
        ListIterator<String> iter = list.listIterator(list.size());
        while (iter.hasPrevious()){
            String str = iter.previous();
            System.out.println(str);
        }

        System.out.println(".........");
        System.out.println("sorting the list");
        Collections.sort(list);
        for(String val:list)
            System.out.println(val.toUpperCase());
    }
}
