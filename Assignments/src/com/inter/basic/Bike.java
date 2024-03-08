package com.inter.basic;

public class Bike extends Vehicle implements IExternal{
    String capacity;

    public Bike(String brand, String model, double price, String capacity) {
        super(brand, model, price);
        this.capacity = capacity;
    }

   void showType(){
       System.out.println("Showing bike type");
   }

    @Override
    public void showAccessories() {
        System.out.println("showing bike accesories");
    }

    @Override
    public void exterior() {
        System.out.println("bike exterior");
    }

    @Override
    void getMileage() {
        System.out.println("bike mileage");
    }
}
