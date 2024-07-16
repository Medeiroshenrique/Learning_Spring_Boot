package com.henriquemedeiros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;


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
        GreetResponse response = new GreetResponse("Hello World!", List.of("C#","Java", "Python"), new Person("Iram Cesar",55, 77777));
        return response;
    }

    record  GreetResponse(String greet, List<String> favoriteProgrammingLanguages, Person person){}

    record Person(String name, int age, double savings){}
 //   class GreetResponse{
   //     private final String greet;
//
  //      GreetResponse(String greet) {
    //        this.greet = greet;
      //  }
//
  //      public String getGreet() {
    //        return greet;
      //      }
        //@Override
        //public String toString() {
          //  return super.toString();
        //}
//
  //      @Override
    //    public boolean equals(Object o) {
      //      if (this == o) return true;
        ////    if (o == null || getClass() != o.getClass()) return false;
            //GreetResponse that = (GreetResponse) o;
            //return Objects.equals(greet, that.greet);
        //}

        //@Override
        //public int hashCode() {
          //  return Objects.hashCode(greet);
       // }
    //}
}
