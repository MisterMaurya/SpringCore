package com.spring.core7;


import org.springframework.beans.factory.annotation.Autowired;

public class Human {

    private Heart heart;

    public Human() {

    }


    public Human(Heart heart) {
        this.heart = heart;
    }

    @Autowired
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
