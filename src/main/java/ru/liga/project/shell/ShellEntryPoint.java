package ru.liga.project.shell;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import ru.liga.project.domain.InfectionStatistic;

@ShellComponent
public class ShellEntryPoint {


    private final InfectionStatistic infectionStatistic;

    @Autowired
    public ShellEntryPoint(InfectionStatistic infectionStatistic) {
        this.infectionStatistic = infectionStatistic;
    }

    @ShellMethod("Modelling N times. Enter n:")
    public String infectionModelling(
            @ShellOption(defaultValue = "3") String n
    ) {
        // invoke service
        infectionStatistic.tryNTimesAndPrint(Integer.parseInt(n));
        return "work";
    }
}
