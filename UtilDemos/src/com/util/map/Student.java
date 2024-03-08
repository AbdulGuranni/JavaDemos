package com.util.map;

public class Student {
    private String studeName;
    private String city;

    public Student() {
        super();
    }

    public Student(String studeName, String city) {
        this.studeName = studeName;
        this.city = city;
    }

    public String getStudeName() {
        return studeName;
    }

    public void setStudeName(String studeName) {
        this.studeName = studeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studeName='" + studeName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
