package com.objects.inheritance;
import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] student = new Student[2];
        for(int i=0;i<2;i++){
            System.out.println("Enter Student name: ");
            String name = sc.next();
            System.out.println("Enter Student department: ");
            String department = sc.next();
             student[i] = new Student(name,department);
             student[i].printDetails();
        }


    }
}
