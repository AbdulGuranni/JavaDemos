package com.util.list;

import com.list.custom.Book;

import java.util.*;

public class BookSetDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java","Kathy",900),
                new Book("Java","Kathy",900),
                new Book("5amclub","Robin",350),
                new Book("Leadership","Robin",900),
                new Book("Spring","Kathy",1900),
                new Book("JSP&Servelts","Kathy",900)
        );
        for (Book book:books){
            System.out.println(book);
        }
        System.out.println(".......................");
        Set<Book> bookSet = new TreeSet<>(books);
        for (Book book:bookSet){
            System.out.println(book);
        }
    }
}
