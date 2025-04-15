package com.luv2code.springboot.demo.mycoolapp.Impls;

import com.luv2code.springboot.demo.mycoolapp.Interfaces.Coach;
import org.springframework.stereotype.Component;
//@Component => Marks the class as a spring bean
@Component
public class CoachImpl implements Coach
{
    @Override
    public String getDailyWorkout() {
        return "Running for 10 minutes";
    }
}
