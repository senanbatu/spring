package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getdailyWorkOut() {
        return "Practice your backhand volley";
    }
}
