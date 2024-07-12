package com.cheteen.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICoach{

     @Override
     public String getDailyWorkout(){
         return "Do Practice !";
     }
}