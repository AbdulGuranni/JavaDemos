package com.threads.basics;
//class A implements Runnable{
//    void run(){
//        System.out.println();
//    }
//}
public class Demo {
    public static void main(String[] args) {
        Runnable task = ()->{
            System.out.println("Task 1");
        };
        Thread t1 = new Thread(task,"pop");
        Thread t2 = new Thread(()->{
            System.out.println("task2");
        },"top");
        t1.start();
        t2.start();
    }
}
