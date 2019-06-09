package com.spring.core9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 *   without setter method or constructor
 *
 */

public class Body {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans9.xml");
        System.out.println("Beans successfully loaded");
        Human human = context.getBean("humanObject", Human.class);
        human.startHeartPumping();
    }
}
