package com.luv2code.springboot.mycoolapp.Impls;

import com.luv2code.springboot.mycoolapp.Interfaces.Coach;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BasketballCoach implements Coach {
    public BasketballCoach() {
        System.out.println("In Constructor BasketballCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "run for 10 km - basketball";
    }
}
