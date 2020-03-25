package ru.liga.project;

import ru.liga.project.domain.InfectionModelling;
import ru.liga.project.domain.InfectionStatistic;
import ru.liga.project.repository.DbVirusRepository;
import ru.liga.project.repository.MemoryPersonRepository;

public class Main {

    public static void main(String[] args) {
        InfectionStatistic infectionStatistic = new InfectionStatistic(
                new InfectionModelling(
                        new DbVirusRepository("jdbcurl", "login", "pass"),
                        new MemoryPersonRepository()
                )
        );

        infectionStatistic.tryNTimesAndPrint(5);
    }
}
