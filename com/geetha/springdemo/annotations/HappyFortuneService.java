package com.geetha.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    public HappyFortuneService() {
//        System.out.println(">> HappyFortuneService - Inside no-arg constructor.");
    }

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
