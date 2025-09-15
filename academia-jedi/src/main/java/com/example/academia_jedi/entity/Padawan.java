package com.example.academia_jedi.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Padawan extends Jedi {
    private String rank;
    private int jediMasterId;
}
