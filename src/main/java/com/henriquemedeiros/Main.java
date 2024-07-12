package com.henriquemedeiros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//@SpringBootApplication
@ComponentScan(basePackages = "com.henriquemedeiros")
@EnableAutoConfiguration
@Configuration
@RestController
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


    @GetMapping ("/hello_word")
    public GreetResponse greet(){

        return new GreetResponse("Hello World!");
    }

    record  GreetResponse(String greet){}
}
