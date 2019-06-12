package com.anotations.withautowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

    @Bean
    public College colBean() {
        return new College();
    }

    @Bean
    public Principal principal() {
        return new Principal();
    }
}
