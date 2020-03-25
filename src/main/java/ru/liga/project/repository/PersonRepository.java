package ru.liga.project.repository;

import org.springframework.stereotype.Component;
import ru.liga.project.domain.Person;

import java.util.List;

@Component
public interface PersonRepository {
    List<Person> findAll();
}
