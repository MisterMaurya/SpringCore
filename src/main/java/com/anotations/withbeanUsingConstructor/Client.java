package com.anotations.withbeanUsingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college = applicationContext.getBean("collegeBean",College.class);
        college.display();
    }
}
