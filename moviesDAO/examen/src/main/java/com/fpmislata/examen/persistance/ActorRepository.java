package com.fpmislata.examen.persistance;

import com.fpmislata.examen.business.entity.Actor;

import java.util.List;

public interface ActorRepository {
    List<Actor> findAll();
}
