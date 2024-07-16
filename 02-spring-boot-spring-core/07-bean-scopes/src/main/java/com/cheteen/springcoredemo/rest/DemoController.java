package com.cheteen.springcoredemo.rest;

import com.cheteen.springcoredemo.common.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private ICoach myCoach;
    private ICoach anotherCoach;

     @Autowired
     public DemoController(@Qualifier("cricketCoach")ICoach theCoach,
                           @Qualifier("cricketCoach")ICoach theAnotherCoach){
         System.out.println("In constructor: " + getClass().getSimpleName());
         myCoach = theCoach;
         anotherCoach = theAnotherCoach;
     }

     @GetMapping("/dailyworkout")
     public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
     }


     @GetMapping("/check")
     public String check(){
         return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
     }

}