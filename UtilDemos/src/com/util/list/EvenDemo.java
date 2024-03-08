package com.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(11,20,4,6,13,12);
        Iterator<Integer> iterator = number.iterator();
        while (iterator.hasNext()){
            Integer num = iterator.next();
            System.out.println(num);
        }
        System.out.println("********************");
        List<Integer> evenNumbers = new ArrayList<>();
        for(Integer numbers:number){
            if(numbers%2==0){
                evenNumbers.add(numbers);
            }
        }
        System.out.println("**********************");
        Iterator<Integer> iterator1 = evenNumbers.iterator();
        while (iterator1.hasNext()){
            Integer numbers1 = iterator1.next();
            System.out.println(numbers1);
        }
    }
}
