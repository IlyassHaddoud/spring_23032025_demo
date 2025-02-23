package com.inetum.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inetum.api.model.Actor;
import com.inetum.api.repository.ActorRepository;

@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> getAllActors()
    {
        return this.actorRepository.findAll();
    }
    
}
