package com.oops.overloading;

public class Vehicle {
    String brand;
    double price;
    String model;

    public Vehicle() {
        System.out.println("default");
    }

    public Vehicle(String brand) {
        this();
        System.out.println("one");
        this.brand = brand;
    }

    public Vehicle(String brand, String model) {
        this(brand);
        System.out.println("two");
        this.model = model;
    }

    public Vehicle(String brand, double price, String model) {
        this(brand,model);
        System.out.println("three");
        this.price = price;

    }
    void getDetails(){
        if(brand!=null)
            System.out.println("Brand:"+" "+brand);
        if(price>0)
            System.out.println("Price:"+" "+price);
        if(model!=null)
            System.out.println("Model:"+" "+model);
    }
}
