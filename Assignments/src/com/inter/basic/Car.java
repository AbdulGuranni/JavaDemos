package com.inter.basic;

public class Car extends Vehicle implements IExternal,IInternal{
    String type;


    public Car(String brand, String model, double price, String type) {
        super(brand, model, price);
        this.type = type;
    }

    @Override
    void getMileage() {
        System.out.println("See your mileage");

    }

    @Override
    public void showAccessories() {
        System.out.println("Accessories are here");
    }

    @Override
    void getDetails() {
        super.getDetails();
    }

    @Override
    public void exterior() {
        System.out.println("Exterior accessories");
    }

    @Override
    public void interior() {
        System.out.println("Interior accessories");
    }
}
