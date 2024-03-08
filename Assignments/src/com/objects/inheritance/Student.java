package com.objects.inheritance;

public class Student {
    String name;
    String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }
    void printDetails(){
        System.out.println("Student name: "+ name);
        System.out.println("Student department:"+ department);
    }
    String getGrades(int... marks){
        int sum=0;
        String grade;
        for(int mark:marks){
            sum=sum+mark;
        }
        int avg = sum/ marks.length;
        float percentage = (sum/100)*100;
        if(percentage>=90 || percentage<=100){
            grade = "A";
        }
        else if(percentage>=80 || percentage<90){
            grade ="B";
        } else if (percentage>=70 || percentage<80) {
            grade = "C";
        }
        else if(percentage >=60 || percentage<70){
            grade = "D";
        }
        else if(percentage>=50 || percentage<60){
            grade="E";
        }
        else{
            grade="Fail";
        }
        return grade;
    }
}
