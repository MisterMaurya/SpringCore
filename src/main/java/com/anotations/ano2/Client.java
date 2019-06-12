package com.anotations.ano2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college = applicationContext.getBean("colBean",College.class);
        college.display();
    }
}
