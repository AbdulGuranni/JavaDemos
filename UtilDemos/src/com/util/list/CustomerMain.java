package com.util.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer("Abdul",1,"Bangalore");
        customerList.add(customer1);
        Customer customer2 = new Customer("Ajay",2,"Bangalore");
        customerList.add(customer2);
        Customer customer3 = new Customer("Hitaishi",3,"Chennai");
        customerList.add(customer3);
        Customer customer4 = new Customer("Gokul",4,"Hyderabad");
        customerList.add(customer4);
        Iterator<Customer> iterator = customerList.iterator();
        for(Customer customers:customerList)
            System.out.println(customers);
        System.out.println("......................................................................");
        while (iterator.hasNext()){
            Customer str= iterator.next();
            System.out.println(str);
        }
        System.out.println("......................................................................");
        List<Customer>  CustomerByCity = new ArrayList<>();
        for(Customer customers1:customerList){
            if(customers1.getCity().equals("Bangalore")){
                CustomerByCity.add(customers1);
            }
        }
        Iterator<Customer> iterator1 = CustomerByCity.iterator();
        while (iterator1.hasNext()){
            Customer customerVar = iterator1.next();
            System.out.println(customerVar);
        }
    }
}
