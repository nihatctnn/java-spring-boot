package com.cheteen.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICoach{

    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

     @Override
     public String getDailyWorkout(){
         return "Do Practice !!!";
     }
}