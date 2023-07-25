package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController  {

    //define a private field for dependency
    private Coach myCoach;

    //define a constructor for dependency injection
    // if we only have 1 constructor, @autowired is just optional.
    @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }
    //myCoach stores the coach I will get. that's why it is called myCoach, if you
    //put CricketCoach as an argument myCoach will be CricketCoach
    //so myCoach is equal to argument "theCoach"


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getdailyWorkOut();
    }
}
