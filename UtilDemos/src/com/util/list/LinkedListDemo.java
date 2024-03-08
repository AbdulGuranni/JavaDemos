package com.util.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Spring");
        list.add("node");
        list.add("Angular");
        list.add("maven");
        System.out.println(list);
        list.addFirst("HTML");
        list.addLast("React");
        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str =iterator.next();
            System.out.println(str);
        }
        System.out.println(list.size());
        System.out.println(list.get(0));
    }
}
