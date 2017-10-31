package com.sda.springjavapoz4.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class IncrementalNumberGeneratorService implements NumberGenerator {


    private int counter;

    @Override
    public int generateNumber(){
        return  counter++;
    }
}
