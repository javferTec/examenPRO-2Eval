package com.fpmislata.examen.business.service.impl;

import com.fpmislata.examen.business.entity.Actor;
import com.fpmislata.examen.business.service.ActorService;
import com.fpmislata.examen.persistance.ActorRepository;

import java.util.List;

public class ActorServiceImpl implements ActorService {
    private final ActorRepository actorRepository;
    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    @Override
    public List<Actor> findByIds(Integer[] actors) {
        return actorRepository.findByIds(actors);
    }
}
