package com.atguigu.service;

import com.atguigu.domain.Person;

import java.util.List;

public interface PersonService {
    public List<Person> findAll();

    public Person findPersonBuId(Integer id);

    public void savePerson(Person person);

    public void updatePerson(Person person);

    public void deletePerson(Integer id);
}
