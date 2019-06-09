package com.spring.core2;


public class Human {

    private Heart heart;

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    void startHeartPumping() {
        if (heart != null)
            heart.pump();
        else
            System.out.println("You are dead");
    }
}
