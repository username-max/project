package ru.liga.project;

import ru.liga.project.domain.InfectionModelling;
import ru.liga.project.domain.InfectionStatistic;
import ru.liga.project.repository.DbRepository;
import ru.liga.project.repository.MemoryRepository;

public class Main {

    public static void main(String[] args) {
        InfectionStatistic infectionStatistic = new InfectionStatistic(
                new InfectionModelling(
                        new DbRepository("jdbcurl", "login", "pass"),
                        new MemoryRepository()
                )
        );
        infectionStatistic.tryNTimesAndPrint(5);
    }
}
