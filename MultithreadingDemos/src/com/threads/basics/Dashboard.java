package com.threads.basics;

import java.awt.print.Book;

public class Dashboard {
    public static void main(String[] args) {
        Booking booking = new Booking();
        // 3 COUNTER for 3 people
        Counter counter1 = new Counter("Tom",10,booking);
        Counter counter2 = new Counter("Sam",20,booking);
        Counter counter3 = new Counter("Jo",12,booking);
    }
}
