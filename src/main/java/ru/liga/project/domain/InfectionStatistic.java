package ru.liga.project.domain;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InfectionStatistic {
    private final InfectionModelling infectionModelling;

    @Autowired
    public InfectionStatistic(InfectionModelling infectionModelling) {
        this.infectionModelling = infectionModelling;
    }

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
