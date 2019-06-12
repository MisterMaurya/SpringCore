package com.anotations.withbeanusingsetter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

    @Bean
    public College collegeBean() {
        College college = new College();
        college.setPricipal(pricipalBean());
        return college;
    }

    @Bean
    public Pricipal pricipalBean() {
        return new Pricipal();
    }
}
