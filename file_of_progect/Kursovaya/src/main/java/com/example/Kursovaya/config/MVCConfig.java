package com.example.Kursovaya.config;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MVCConfig implements WebMvcConfigurer{
    public void addViewController(ViewControllerRegistry registry){
        registry.addViewController("/login").setViewName("/post");
    }
}
