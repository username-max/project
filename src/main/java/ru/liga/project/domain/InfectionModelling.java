package ru.liga.project.domain;

import ru.liga.project.repository.PersonRepository;
import ru.liga.project.repository.VirusRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InfectionModelling {
    private final VirusRepository virusRepository;
    private final PersonRepository personRepository;

    public InfectionModelling(VirusRepository virusRepository, PersonRepository personRepository) {
        this.virusRepository = virusRepository;
        this.personRepository = personRepository;
    }

    public List<InfectionResult> tryToInfect() {
        List<Person> persons = personRepository.findAll();
        List<Virus> viruses = virusRepository.findAll();
        List<InfectionResult> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(infect(person, viruses));
        }
        return result;
    }

    private InfectionResult infect(Person person, List<Virus> viruses) {
        for (Virus virus : viruses) {
            double personChanceToInfectDice = new Random().nextDouble();
            if (personChanceToInfectDice <= virus.getChanceToInfect()){
              return new InfectionResult(person, virus);
            }
        }
        return  new InfectionResult(person, null);
    }
}
