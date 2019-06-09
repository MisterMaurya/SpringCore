package com.spring.core8;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    private Heart heart;

    public Human() {

    }


    public Human(Heart heart) {
        this.heart = heart;
    }

    @Autowired
    @Qualifier("heartObject1")
    public void setHeart(Heart heart) {
        this.heart = heart;
        System.out.println("setter method called");
    }

    void startHeartPumping() {
        if (heart != null)
            heart.pump();
        else
            System.out.println("You are dead");
    }
}
