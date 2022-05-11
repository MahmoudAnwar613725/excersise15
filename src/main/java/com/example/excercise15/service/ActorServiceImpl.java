package com.example.excercise15.service;

 import com.example.excercise15.domain.Actor;
import com.example.excercise15.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ActorServiceImpl implements ActorService{

    @Autowired
    private ActorRepository actorRepository;

    @Override
    public List<Actor> findAll() {
        return actorRepository.findAll();
    }
}
