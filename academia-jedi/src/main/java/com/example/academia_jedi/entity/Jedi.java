package com.example.academia_jedi.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Jedi {
    private int id;
    private String name;
    private String kind;
    private String PlanetOfOrigin;
}
