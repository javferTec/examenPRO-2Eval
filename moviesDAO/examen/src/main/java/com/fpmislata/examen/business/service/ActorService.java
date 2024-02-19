package com.fpmislata.examen.business.service;

import com.fpmislata.examen.business.entity.Actor;

import java.util.List;

public interface ActorService {
    List<Actor> findAll();

    List<Actor> findByIds(List<Integer> actors);
}
