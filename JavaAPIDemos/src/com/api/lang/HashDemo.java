package com.api.lang;
public class HashDemo {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Audi","Black","X100");
        Vehicle vehicle2 = new Vehicle("Audi","White","X100");
        Vehicle vehicle3 = new Vehicle("Audi","White","A100");
        Vehicle vehicle4 = new Vehicle("Audi","Black","Audi");

        String model = vehicle1.getModel();
        String brand = vehicle1.getBrand();
        String colour = vehicle1.getColour();

        System.out.println(vehicle1.equals(vehicle2));
        System.out.println(vehicle1.equals(vehicle3));
        System.out.println(vehicle1.equals(vehicle4));


        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());
        System.out.println(vehicle3.hashCode());
        System.out.println(vehicle4.hashCode());

    }
}
