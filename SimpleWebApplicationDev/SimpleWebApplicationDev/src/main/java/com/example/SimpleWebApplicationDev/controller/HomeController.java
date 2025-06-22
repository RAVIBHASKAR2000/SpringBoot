package com.example.SimpleWebApplicationDev.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller

@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public  String greet(){
        return  "HEYYYY welcome";
    }

    @RequestMapping("/about")
    public  String about(){
        return " About this project";
    }
}
