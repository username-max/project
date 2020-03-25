package ru.liga.project.domain;


import lombok.Data;

@Data
public class InfectionResult {
    private final Person person;
    private final Virus virus;

    public InfectionResult(Person person, Virus virus) {
        this.person = person;
        this.virus = virus;
    }

    public boolean isInfected() {
        return virus != null;
    }
}
