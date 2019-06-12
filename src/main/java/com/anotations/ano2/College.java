package com.anotations.ano2;

import org.springframework.stereotype.Component;

@Component("colBean")
public class College {
    public void display() {
        System.out.println("Display two work");
    }
}
