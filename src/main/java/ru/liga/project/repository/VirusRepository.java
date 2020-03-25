package ru.liga.project.repository;

import org.springframework.stereotype.Component;
import ru.liga.project.domain.Virus;

import java.util.List;

@Component
public interface VirusRepository {
    List<Virus> findAll();
}
