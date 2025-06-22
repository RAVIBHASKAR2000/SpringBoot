package com.example.ConstructorInjectionWithSpring;


import org.springframework.stereotype.Component;

@Component
public class Laptop {
    void Compile(){
        System.out.println("compiling code");
    }
    void Build(){
        System.out.println("Building code");
    }
}
