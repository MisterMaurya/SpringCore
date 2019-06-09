package com.spring.value2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("value2.xml");
        System.out.println("Beans successfully loaded....");
        Student student = context.getBean("studentObject", Student.class);
        student.displayInfo();
    }

}
