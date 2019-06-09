package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("beans successfully loaded..");
        Airtel airtel = context.getBean("airtelObject", Airtel.class);
        airtel.activateService();
    }
}
