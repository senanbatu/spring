package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // component makes it a spring bean, makes it
            // available for dependency injection
public class CricketCoach implements Coach{
    @Override
    public String getdailyWorkOut() {
        return "Practice fast bowling for 15 minutes";

    }
}
