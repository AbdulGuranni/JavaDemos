package com.threads.basics;
class Child extends Thread{

    public Child(String name,int priority){
        super(name);
        System.out.println(this);
        //this.start();
    }
    @Override
    public void run() {
    for (int i=1;i<=10;i++){
        System.out.println(Thread.currentThread().getName());
        System.out.println("5"+"*"+i+"="+5*i);
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    }
}
public class ExThread {
    public static void main(String[] args) {
//        Child child1 = new Child("child-One",10);
//        child1.setName("Child-One");
//        System.out.println(child1);
        //child1.start();
        Child child2 = new Child("child-two",6);
        child2.setName("child-two");
        child2.setDaemon(true);
        child2.start();
//        System.out.println(child2);
//        child2.start();
//        Child child3 = new Child("child-3",7);
//        System.out.println();
        for (int i=1;i<=10;i++){
            String name =Thread.currentThread().getName();
            System.out.println("5"+"*"+i+"="+5*i+name);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
//        try {
//            child1.join();
//            child2.join();
//            child3.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        System.out.println("main completed");
    }
}
