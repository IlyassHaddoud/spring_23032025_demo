package com.inetum.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inetum.api.model.Actor;


@Repository
public interface ActorRepository extends JpaRepository<Actor, Long>{
    
}
