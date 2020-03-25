package ru.liga.project.repository;

import ru.liga.project.domain.Virus;

import java.util.List;

public interface VirusRepository {
    List<Virus> findAll();
}
