package com.example.academia_jedi.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Master extends Jedi {
    private Set<Integer> padawanIds;
    private String speciality;
}
