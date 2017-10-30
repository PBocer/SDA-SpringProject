package com.sda.springjavapoz4.service;


import org.springframework.stereotype.Component;

import java.util.Random;

//@Component
public class SomeService {

    private int value;

    private String message;

    public SomeService (String message){
        Random random= new Random();
        this.value= random.nextInt(1000);
        this.message= message;
    }
    public void someAction(){
        System.out.println(message +" "+  value);
    }
}
