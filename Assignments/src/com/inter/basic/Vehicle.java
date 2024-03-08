package com.inter.basic;

public abstract class Vehicle implements IInsurance{
    String brand;
    String model;
    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void getDetails(){
        System.out.println("Brand: "+brand+"Model: "+model+"Price: "+price);
    }

    abstract void getMileage();
    public void insuranceDetails() {
        System.out.println("This is insurance ");
    }

}
