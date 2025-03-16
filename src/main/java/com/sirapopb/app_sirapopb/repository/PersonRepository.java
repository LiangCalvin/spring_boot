package com.sirapopb.app_sirapopb.repository;

import com.sirapopb.app_sirapopb.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository implements PersonDAO{
    private EntityManager entityManager;

    @Autowired
    public PersonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Person person) {
        entityManager.persist(person);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Person target = entityManager.find(Person.class,id);
        entityManager.remove(target);
    }

    @Override
    public Person get(Integer id) {
        Person result = entityManager.find(Person.class, id);
        return result;
    }

    @Override
    public List<Person> getAll() {
        TypedQuery<Person> query_store = entityManager.createQuery(
                "SELECT p FROM Person p",Person.class
        );
        return query_store.getResultList();
    }

    @Override
    @Transactional
    public Person update(Person person) {
        entityManager.merge(person);
        return person;
    }


}
