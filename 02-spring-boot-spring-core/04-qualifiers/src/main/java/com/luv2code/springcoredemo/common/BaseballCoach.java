package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Override
    public String getdailyWorkOut() {
        return "Spend 30 minutes in batting practice";
    }
}
