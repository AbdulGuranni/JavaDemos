package com.threads.concurrency;

import com.threads.basics.Booking;
import com.threads.basics.Greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(()->{
            System.out.println("Doing polling");
            Greetings greet = new Greetings();
            greet.sayHello("Priya");
        });
        executorService.execute(()->{
            System.out.println("Extracting name from usl");
            Booking booking = new Booking();
            System.out.println(booking.bookTickets("Sri",20));
        });
    }
}
