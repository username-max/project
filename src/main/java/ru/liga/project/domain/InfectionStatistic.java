package ru.liga.project.domain;


import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class InfectionStatistic {
    private final InfectionModelling infectionModelling;

    public void tryNTimesAndPrint(long n) {
        for (int i = 0; i < n; i++) {
            List<InfectionResult> infectionResults = infectionModelling.tryToInfect();
            printInfectionResult(infectionResults);
        }
    }

    private void printInfectionResult(List<InfectionResult> infectionResults) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        for (InfectionResult infectionResult : infectionResults) {
            System.out.println(infectionResult);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
    }

}
