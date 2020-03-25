package ru.liga.project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.liga.project.domain.Virus;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;


@Component
public class DbVirusRepository implements VirusRepository {
    private final String jdbcurl;
    private final String login;
    private final String pass;

    @Autowired
    public DbVirusRepository(@Value("inf.jdbcurl") String jdbcurl,
                             @Value("inf.login") String login,
                             @Value("inf.pass") String pass) {
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
