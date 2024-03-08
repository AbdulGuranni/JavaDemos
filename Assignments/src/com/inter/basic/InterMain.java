package com.inter.basic;

public class InterMain {
    public static void main(String[] args) {
        Vehicle car = new Car("honda","city",97655,"4 wheeler");
        car.getDetails();
        car.insuranceDetails();

        IInsurance insurance = new Car("honda","city1",23456,"4 wheeler");
        IInsurance iInsurance = car;
        insurance.insuranceDetails();

        IAccessories accessories = (IAccessories) car;
        accessories.showAccessories();
    }
}
