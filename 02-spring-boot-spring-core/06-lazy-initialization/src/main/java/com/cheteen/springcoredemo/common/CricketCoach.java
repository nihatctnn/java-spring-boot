package com.cheteen.springcoredemo.common;

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