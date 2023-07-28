package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController{

    //define a private field for dependency
    private Coach myCoach;

    private Coach anotherCoach;


    //define a constructor for dependency injection
    // if we only have 1 constructor, @autowired is just optional.

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach,
                          @Qualifier("cricketCoach") Coach theAnotherCoach){

        System.out.println("In constructor: "+ getClass().getSimpleName());

        myCoach = theCoach;
        anotherCoach=theAnotherCoach;
    }

    //myCoach stores the coach I will get. that's why it is called myCoach, if you
    //put Cricket Coach as an argument myCoach will be CricketCoach
    //so myCoach is equal to argument "theCoach"



    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getdailyWorkOut();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans : myCoach == anotherCoach, " +(myCoach==anotherCoach);
    }
}
