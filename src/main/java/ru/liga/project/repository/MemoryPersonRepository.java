package ru.liga.project.repository;

import org.springframework.stereotype.Component;
import ru.liga.project.domain.Person;

import java.util.List;

import static java.util.Arrays.asList;


@Component
public class MemoryPersonRepository implements PersonRepository {
    @Override
    public List<Person> findAll() {
        return asList(
                new Person("Вася"),
                new Person("Петя")
        );
    }
}
