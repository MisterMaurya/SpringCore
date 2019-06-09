package com.spring.core8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 *   expected single matching bean but found 2: heartObject1,heartObject2
 *
 */

public class Body {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans8.xml");
        System.out.println("Beans successfully loaded");
        Human human = context.getBean("humanObject", Human.class);
        human.startHeartPumping();
    }
}
