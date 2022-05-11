package com.example.excercise15.controller;

import com.example.excercise15.domain.Actor;
import com.example.excercise15.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping(value = "/actors")
    public List<Actor> findAll() {
        return actorService.findAll();
    }
}
