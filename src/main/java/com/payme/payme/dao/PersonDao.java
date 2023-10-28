package com.payme.payme.dao;

import com.payme.payme.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    //    Insert Person Record with an ID
    int insertPerson(UUID id, Person person);

    //    Insert Person record without an id
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    //    Select All People
    List<Person> selectAllPeople();

    //    Select Person By ID
    Optional<Person> selectPersonById(UUID id);

    //    Delete Template
    int deletePersonById(UUID id);

    //    Update Template
    int updatePersonById(UUID id, Person person);
}
