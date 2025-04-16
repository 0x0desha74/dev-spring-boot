package com.luv2code.springboot.mycoolapp.Impls;

import com.luv2code.springboot.mycoolapp.Interfaces.Coach;
import org.springframework.stereotype.Component;

@Component

public class VolleyballCoach implements Coach {
    public VolleyballCoach() {
        System.out.println("In Constructor VolleyballCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Volleyball";
    }
}
