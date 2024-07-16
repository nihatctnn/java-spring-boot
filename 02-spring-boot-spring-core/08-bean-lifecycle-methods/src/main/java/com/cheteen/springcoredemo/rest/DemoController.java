package com.cheteen.springcoredemo.rest;

import com.cheteen.springcoredemo.common.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private ICoach myCoach;

     @Autowired
     public DemoController(@Qualifier("aquatic")ICoach theCoach){
         System.out.println("In constructor: " + getClass().getSimpleName());
         myCoach = theCoach;
     }

     @GetMapping("/dailyworkout")
     public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
     }

}