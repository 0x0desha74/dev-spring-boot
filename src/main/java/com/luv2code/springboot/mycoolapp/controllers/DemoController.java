package com.luv2code.springboot.mycoolapp.controllers;

import com.luv2code.springboot.mycoolapp.Interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private  Coach myCoach;
    @Autowired
    public void setCoach(Coach theCoach){
       myCoach = theCoach;
    }
    @GetMapping("/workout")
    public String getWorkout(){
        return myCoach.getDailyWorkout();
    }
}
