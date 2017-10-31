package com.sda.springjavapoz4.config;


import com.sda.springjavapoz4.service.CalcService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class CalkServisConfig {

    @Profile("dev")
    @Bean
    public CalcService devCarlService(){
        return new CalcService("This is dev bean");
    }
    @Profile("prod")
    @Bean
    public CalcService prodCarlService(){
        return new CalcService("This is prod bean");
    }
}
