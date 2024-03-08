package com.oops.overloading;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        System.out.println();
        Vehicle vehicle2 = new Vehicle("BMW");
        System.out.println();
        Vehicle vehicle3 = new Vehicle("Suzuki","Suzuki 1");
        System.out.println();
        Vehicle vehicle4 = new Vehicle("Ferarri",12000,"Ferarri 2");
        vehicle1.getDetails();
        vehicle2.getDetails();
        vehicle3.getDetails();
        vehicle4.getDetails();
    }
}
