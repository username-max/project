package ru.liga.project.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Virus {
    private String name;
    private double chanceToInfect;
}
