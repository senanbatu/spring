package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // component makes it a spring bean, makes it
            // available for dependency injection
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
    //define our init method


    @Override
    public String getdailyWorkOut() {
        return "Practice fast bowling for 15 minutes";

    }
}
