package com.spring.value2;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("${student.name}")
    private String name;

    @Value("${student.hobby}")
    private String hobby;

    @Value("${student.interestedCourse}")
    private String interestedCourse;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                ", interestedCourse='" + interestedCourse + '\'' +
                '}';
    }

    public void displayInfo() {
        System.out.println("Display Student Info------------\n\n" + toString());
    }
}
