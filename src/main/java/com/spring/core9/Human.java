package com.spring.core9;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    @Autowired
    @Qualifier("heartObject1")
    private Heart heart;

    void startHeartPumping() {
        if (heart != null)
            heart.pump();
        else
            System.out.println("You are dead");
    }
}
