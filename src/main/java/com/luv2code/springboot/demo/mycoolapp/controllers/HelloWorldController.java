package com.luv2code.springboot.demo.mycoolapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String Hello(){
        return "Hello, World From Egypt!";
    }
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from hello";
    }
    @GetMapping("/newone/{name}")
    public String Hello(@PathVariable String name ){
        return "Hello "+name;
    }
}
