package com.oops.basics;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Raju",12,3000);
        Employee employee2 = new Employee("Abdul",14,2000);
        System.out.println(employee1.greet("Hello"));
        employee1.getDetails();
        System.out.println("************************");
        System.out.println(employee2.greet("Hi"));
        employee2.getDetails();
    }
}
