package com.util.map;

import java.util.*;

public class MapStudent {
    public static void main(String[] args) {
        Map<Department, List<Student>> map = new HashMap<>();
        Department Department1 = new Department("ISE",10,"Abdul");
        Department Department2 = new Department("CSE",20,"Gokul");
        Department Department3 = new Department("ECE",30,"Hitaishi");
        map.put(Department1, Arrays.asList(new Student("Ajay","Bangalore"),
                new Student("Ankit","Mumbai"),
                new Student("Arvind","Chennai")));
        map.put(Department2, Arrays.asList(new Student("Manjunath","Bangalore"),
                new Student("Harish","Hyderabad"),
                new Student("Hitesh","Chennai")));
        map.put(Department3, Arrays.asList(new Student("Priya","Bangalore"),
                new Student("Rahul","Mysore"),
                new Student("Yash","Hassan")));
        System.out.println(map.get(Department1));
        System.out.println(map.get(Department2));
        System.out.println(map.get(Department3));
        Set<Department> departments = map.keySet();
        for(Department department:departments){
            System.out.println(department.getDeptHead()+" "+department.getDeptName());
            List<Student> students = map.get(department);
            for (Student student:students){
                System.out.println(student.getStudeName());
            }
        }
    }
}
