package com.inetum.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.inetum.api.model.Actor;
import com.inetum.api.service.ActorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping("/actors")
    public List<Actor> getAllActors() {
        return this.actorService.getAllActors();
    }

    @PostMapping("/actors")
    public Actor addActor(@RequestBody Actor actor) {
        return this.actorService.createActor(actor);
    }
}
