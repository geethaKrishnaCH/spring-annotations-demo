package com.geetha.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "volleyCoach")
public class VolleyballCoach implements Coach {
    private FortuneService fortuneService;

//    @Autowired
//    public VolleyballCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


    public VolleyballCoach() {
//        System.out.println(">> VolleyballCoach - Inside no-args constructor.");
    }

    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println(">> VolleyballCoach - Inside setFortuneService() method.");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice hitting from left for 20 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
