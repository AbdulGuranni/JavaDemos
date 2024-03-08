package com.threads.basics;

public class Counter implements Runnable {
    Booking booking;
    String name;
    int noOfTickets;

    public Counter(String name, int noOfTickets,Booking booking) {
        super();
        this.name = name;
        this.noOfTickets = noOfTickets;
        this.booking = booking;
        Thread t = new Thread(this,name);
        t.start();
    }
    public void run(){
        synchronized (booking) {
            System.out.println("Welcome to ABC Theatre" + name);
            double amount = booking.bookTickets(name, noOfTickets);
            System.out.println("Amount to be paid" + amount);
        }
    }
}
