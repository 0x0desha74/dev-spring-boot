package com.luv2code.springboot.mycoolapp.Impls;

import com.luv2code.springboot.mycoolapp.Interfaces.Coach;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//@Component => Marks the class as a spring bean
@Component
public class FootballCoach implements Coach
{
    public FootballCoach() {
        System.out.println("In Constructor FootballCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Running for 10 minutes - football";
    }
}
