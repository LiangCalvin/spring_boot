package com.sirapopb.app_sirapopb.repository;

import com.sirapopb.app_sirapopb.entity.Person;

import java.util.List;

public interface PersonDAO {
    void save(Person person);
    void delete(Integer id);
    Person get(Integer id);
    List<Person> getAll();
    Person update(Person person);
}
