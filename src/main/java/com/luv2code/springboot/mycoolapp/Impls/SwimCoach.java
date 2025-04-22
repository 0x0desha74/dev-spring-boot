package com.luv2code.springboot.mycoolapp.Impls;

import com.luv2code.springboot.mycoolapp.Interfaces.Coach;

public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim 2 Hours a day!";
    }
}
