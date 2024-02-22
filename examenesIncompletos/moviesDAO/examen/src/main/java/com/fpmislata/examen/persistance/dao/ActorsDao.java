package com.fpmislata.examen.persistance.dao;

import com.fpmislata.examen.business.entity.Actor;

import java.util.ArrayList;
import java.util.List;

public class ActorsDao {
    private List<Actor> actors = new ArrayList<>(List.of(
            new Actor(1, "Actor 1", 1000, 8000),
            new Actor(2, "Actor 2", 2000, 8000),
            new Actor(3, "Actor 3", 3000, 8000),
            new Actor(4, "Actor 4", 4000, 8000),
            new Actor(5, "Actor 5", 5000, 8000),
            new Actor(6, "Actor 6", 6000, 8000)
    ));

    public List<Actor> findAll() {
        return actors;
    }

    public Actor findById(int id) {
        for (Actor actor : actors) {
            if (actor.getId() == id) {
                return actor;
            }
        }
        return null;
    }

    public List<Actor> findByIds(Integer[] actorIds) {
        List<Actor> foundActors = new ArrayList<>();
        for (Integer id : actorIds) {
            Actor actor = findById(id);
            if (actor != null) {
                foundActors.add(actor);
            }
        }
        return foundActors;
    }
}
