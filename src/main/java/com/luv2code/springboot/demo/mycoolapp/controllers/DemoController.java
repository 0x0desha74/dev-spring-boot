package com.luv2code.springboot.demo.mycoolapp.controllers;

import com.luv2code.springboot.demo.mycoolapp.Interfaces.Coach;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach coach;
    public DemoController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/workout")
    public String getWorkout(){
        return coach.getDailyWorkout();
    }
}
