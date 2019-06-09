package com.spring.core4;


import com.spring.core4.Heart;

public class Human {

    private Heart heart;

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
