package com.anotations.withbeanUsingConstructor;

public class College {


    private Principal principal;

    public College(Principal principal) {
        this.principal = principal;
    }

    void display() {
        principal.displayInfo();
        System.out.println();
    }
}
