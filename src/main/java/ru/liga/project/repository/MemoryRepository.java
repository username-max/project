package ru.liga.project.repository;

import ru.liga.project.domain.Person;

import java.util.List;

import static java.util.Arrays.asList;

public class MemoryRepository implements PersonRepository {
    @Override
    public List<Person> findAll() {
        return asList(
                new Person("Вася"),
                new Person("Петя")
        );
    }
}
