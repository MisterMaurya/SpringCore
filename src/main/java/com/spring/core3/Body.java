package com.spring.core3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/***
 *  Autowired by Name
 *
 */
public class Body {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        System.out.println("Beans successfully loaded");
        Human human = context.getBean("humanObject",Human.class);
        human.startHeartPumping();
    }
}
