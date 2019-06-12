package com.anotations.withbeanusingsetter;

public class College {


    private  Pricipal pricipal;

    public void setPricipal(Pricipal pricipal) {
        this.pricipal = pricipal;
    }

    public void display() {
        pricipal.dispalyPrincipalInfo();
        System.out.println("Bean Works");
    }
}
