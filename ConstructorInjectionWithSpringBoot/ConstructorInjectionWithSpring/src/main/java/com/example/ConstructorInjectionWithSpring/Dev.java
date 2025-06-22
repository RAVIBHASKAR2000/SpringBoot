package com.example.ConstructorInjectionWithSpring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component   //  this annotation tells the spring that its spring managed class
public class Dev {

    @Autowired    // does the autowiring  === meaning connecting both the class as they are interconnected
    private  Laptop laptop;  // field injection

    Dev(){
    }

    /*

    Dev(Laptop laptop){
        this.laptop = laptop;   // constructor injection
    }


    @Autowired
    void setLaptop(Laptop lap){
        this.laptop = lap;  // setter injection
     }
     */

    void code(){
        laptop.Compile();
        laptop.Build();
    }


}
