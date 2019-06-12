package com.anotations.withautowired;

import org.springframework.beans.factory.annotation.Autowired;

public class College {
    @Autowired
    private Principal principal;

    void test(){
        principal.display();
    }

}
