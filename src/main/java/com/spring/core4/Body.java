package com.spring.core4;

import com.spring.core4.Human;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 *  Autowired by Type
 *
 */

public class Body {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
        System.out.println("Beans successfully loaded");
        Human human = context.getBean("humanObject",Human.class);
        human.startHeartPumping();
    }
}
