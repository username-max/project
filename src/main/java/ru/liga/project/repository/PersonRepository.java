package ru.liga.project.repository;

import ru.liga.project.domain.Person;

import java.util.List;

public interface PersonRepository {
    List<Person> findAll();
}
