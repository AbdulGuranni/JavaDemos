package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java","Kathy",900),
                new Book("5amclub","Robin",350),
                new Book("Leadership","Robin",900),
                new Book("Spring","Kathy",1900),
                new Book("JSP&Servelts","Kathy",900)
        );
        System.out.println("Before sorting");
        for(Book nbook:books)
            System.out.println(nbook);

        System.out.println("After sorting");
        Collections.sort(books);
        for(Book nbook:books)
            System.out.println(nbook);
        System.out.println();

    }
}
