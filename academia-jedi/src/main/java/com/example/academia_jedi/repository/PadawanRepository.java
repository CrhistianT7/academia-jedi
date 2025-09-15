package com.example.academia_jedi.repository;

import com.example.academia_jedi.entity.Padawan;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public class PadawanRepository {
    private final List<Padawan> storage = new CopyOnWriteArrayList<>();

    public List<Padawan> findAll() {
        return List.copyOf(storage);
    }

    @PostConstruct
    public void initData() {
        Padawan p1 = Padawan.builder()
                .id(1)
                .name("Ezra Bridger")
                .kind("Human")
                .PlanetOfOrigin("Earth")
                .jediMasterId(1)
                .rank("Trainee")
                .build();

        storage.add(p1);
    }

}
