package com.cheteen.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private ICoach myCoach;

    @Autowired
    public DemoController(ICoach theCoach){
        this.myCoach = theCoach;
    }

     @GetMapping("/dailyworkout")
     public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
     }
}