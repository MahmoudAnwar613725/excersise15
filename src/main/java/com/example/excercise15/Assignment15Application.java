package com.example.excercise15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Assignment15Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Assignment15Application.class, args);

//        CountryService countryService = context.getBean(CountryService.class);
//        ActorService actorService = context.getBean(ActorService.class);
//
//        countryService.findAll().forEach(System.out::println);
//        actorService.findAll().forEach(System.out::println);
    }

}
