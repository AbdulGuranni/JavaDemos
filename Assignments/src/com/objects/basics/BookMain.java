package com.objects.basics;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Java","Williams",600,"Technical");
        Book book2 = new Book("Spring","John",400,"Technical");
        book1.getDetails();
        System.out.println("This book is");
        book1.checkBookType();
        System.out.println("***************");
        book2.getDetails();
        System.out.println("This book is");
        book1.checkBookType();
    }
}
