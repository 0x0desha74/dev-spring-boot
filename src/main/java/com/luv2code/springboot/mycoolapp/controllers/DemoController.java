package com.luv2code.springboot.mycoolapp.controllers;

import com.luv2code.springboot.mycoolapp.Interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {



    private final Coach myCoach;
    private final Coach anotherCaoch;

    public DemoController(@Qualifier("basketballCoach") Coach myCoach,
                          @Qualifier("basketballCoach") Coach anotherCaoch) {
        this.myCoach = myCoach;
        this.anotherCaoch = anotherCaoch;
//        System.out.println("In Constructor : DemoController");
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        //ProtoType => False -> New bean for each request or injection
        //Singleton => True -> same bean used all over the project
        return "Comparing beans: myCoach == anotherCoach => " + (myCoach == anotherCaoch);
    }
}
