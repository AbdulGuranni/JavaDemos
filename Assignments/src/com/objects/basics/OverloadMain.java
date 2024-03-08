package com.objects.basics;
import java.util.Scanner;
public class OverloadMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emplist = new Employee[3];
        for (int i=0;i<3;i++){
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter employee designation");
            String designation = sc.next();
            emplist[i] = new Employee(name,designation);
        }
        System.out.println("Enter designation");
        String choice = sc.next();
        for(Employee employee:emplist){
            if(choice.equals("Programmer")){
                System.out.println(employee.calcBonus(100));
                break;
            }
            else if(choice.equals("Manager")){
                System.out.println(employee.calcBonus(100,200,"Car"));
                break;
            }
            else{
                System.out.println(employee.calcBonus(100,"House",200,300));
                break;
            }
        }
    }
}
