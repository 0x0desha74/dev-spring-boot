package com.luv2code.springboot.mycoolapp.controllers;

import com.luv2code.springboot.mycoolapp.Interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {



    private final Coach myCoach;

    public DemoController(@Qualifier("basketballCoach") Coach myCoach ){
        this.myCoach = myCoach;

//        System.out.println("In Constructor : DemoController");
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return myCoach.getDailyWorkout();
    }


}
