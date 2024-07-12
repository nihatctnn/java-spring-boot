package com.cheteen.springcoredemo.rest;

import com.cheteen.springcoredemo.common.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private ICoach myCoach;

     @Autowired
     public DemoController(ICoach theCoach){
         myCoach = theCoach;
     }

     @GetMapping("/dailyworkout")
     public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
     }
}