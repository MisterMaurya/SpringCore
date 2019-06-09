package com.spring.value;

public class Student {

    private String name;
    private String hobby;
    private String interestedCourse;

    public void setName(String name) {
        this.name = name;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                ", interestedCourse='" + interestedCourse + '\'' +
                '}';
    }

    public void displayInfo() {
        System.out.println("Display Student Info------------\n\n"+toString());
    }
}
