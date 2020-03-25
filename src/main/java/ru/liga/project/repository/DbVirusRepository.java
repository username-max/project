package ru.liga.project.repository;

import ru.liga.project.domain.Virus;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class DbVirusRepository implements VirusRepository {
    private final String jdbcurl;
    private final String login;
    private final String pass;

    public DbVirusRepository(String jdbcurl, String login, String pass) {
        this.jdbcurl = jdbcurl;
        this.login = login;
        this.pass = pass;
    }

    @Override
    public List<Virus> findAll() {
        return asList(
                new Virus("Covid 19", 0.03),
                new Virus("Ветрянка", 0.78)
        );
    }
}
