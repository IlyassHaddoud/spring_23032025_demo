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

    public Actor createActor(Actor actor)
    {
        return this.actorRepository.save(actor);
    }

    public Actor updateActor(Long id, Actor updatedActor)
    {
        Actor a = this.actorRepository.findById(id).orElseThrow(() -> new RuntimeException("Actor not found"));

        a.setFirstName(updatedActor.getFirstName());
        a.setLastName(updatedActor.getLastName());

        return this.actorRepository.save(a);
    }
    
    public void deleteActor(Long id)
    {
        this.actorRepository.deleteById(id);
    }
}
