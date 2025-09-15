package com.example.academia_jedi.entity;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Master extends Jedi {
    private Set<Integer> padawanIds;
    private String speciality;
}
