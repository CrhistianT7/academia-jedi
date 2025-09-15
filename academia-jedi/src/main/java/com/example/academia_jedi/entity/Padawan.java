package com.example.academia_jedi.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Padawan extends Jedi {
    private String rank;
    private int jediMasterId;
}
