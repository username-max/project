package ru.liga.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.liga.project.domain.InfectionStatistic;

public class Main {

    public static void main(String[] args) {
//        InfectionStatistic infectionStatistic = new InfectionStatistic(
//                new InfectionModelling(
//                        new DbRepository("jdbcurl", "login", "pass"),
//                        new MemoryRepository()
//                )
//        );

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        InfectionStatistic istat = (InfectionStatistic) context.getBean("infectionStatistic");
        istat.tryNTimesAndPrint(5);
//        infectionStatistic.tryNTimesAndPrint(5);
    }
}
