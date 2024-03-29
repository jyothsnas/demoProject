package com.portal.demoProject.config;

import com.github.javafaker.Faker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public class FakerConfig {

    @Bean
    public Faker getFaker(){
        return new Faker();
    }

}