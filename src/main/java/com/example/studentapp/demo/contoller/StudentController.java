package com.example.studentapp.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class StudentController {

    @GetMapping(value = "/api")
    public String welcome(){

        return "welcome to the spring Boot";
    }

    @GetMapping(value = "/hello")
    public String hello(){
        String s = "name something as you like it and there is no objection";
        return "Naveen, I hope you are having a Great Day!!";
    }
}
