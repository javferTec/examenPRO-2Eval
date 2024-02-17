package com.fpmislata.examen.persistance.dao;

import com.fpmislata.examen.business.entity.Director;

import java.util.ArrayList;
import java.util.List;

public class DirectorsDao {
    private List<Director> directors = new ArrayList<>(List.of(
            new Director(1, "Director 1", 1000, 9000),
            new Director(2, "Director 2", 2000, 9000),
            new Director(3, "Director 3", 3000, 9000),
            new Director(4, "Director 4", 4000, 9000),
            new Director(5, "Director 5", 5000, 9000),
            new Director(6, "Director 6", 6000, 9000)
    ));

    public List<Director> getAll() {
        return directors;
    }
}
