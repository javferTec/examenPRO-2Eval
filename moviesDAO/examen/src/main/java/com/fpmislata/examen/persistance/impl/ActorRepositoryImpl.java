package com.fpmislata.examen.persistance.impl;

import com.fpmislata.examen.business.entity.Actor;
import com.fpmislata.examen.persistance.ActorRepository;
import com.fpmislata.examen.persistance.dao.ActorsDao;

import java.util.List;

public class ActorRepositoryImpl implements ActorRepository {
    private ActorsDao actors = new ActorsDao();
    @Override
    public List<Actor> findAll() {
        return actors.findAll();
    }
}
