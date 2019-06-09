package com.spring.core5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 *  Autowired by Constructor
 *
 */

public class Body {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");
        System.out.println("Beans successfully loaded");
        Human human = context.getBean("humanObject", Human.class);
        human.startHeartPumping();
    }
}
