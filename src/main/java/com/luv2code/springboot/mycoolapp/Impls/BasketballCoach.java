package com.luv2code.springboot.mycoolapp.Impls;

import com.luv2code.springboot.mycoolapp.Interfaces.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {
    public BasketballCoach() {
        System.out.println("In Constructor BasketballCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "run for 10 km - basketball";
    }

    @PostConstruct
    public void doSomeStartUpStuff(){
        System.out.println("In doMyStartUpStuff: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doSomeDestructionStuff(){
        System.out.println("In doSomeDestructionStuff: " + getClass().getSimpleName());
    }
}
