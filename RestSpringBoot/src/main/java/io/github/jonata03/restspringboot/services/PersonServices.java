package io.github.jonata03.restspringboot.services;

import io.github.jonata03.restspringboot.exceptions.ResourceNotFoundException;
import io.github.jonata03.restspringboot.model.Person;
import io.github.jonata03.restspringboot.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    public List<Person> findAll() {

        logger.info("finding all people!");

        return repository.findAll();
    }

    public Person findById(Long id) {

        logger.info("procurando uma pessoa");

        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("nao encontrado este id"));
    }

    public Person create(Person person) {

        logger.info("criando mais uma pessoa!");

        return repository.save(person);
    }

    public Person update(Person person) {

        logger.info("criando mais uma pessoa!");
        var entity = repository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("nao encontrado este id"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        return repository.save(person);
    }

    public void delete(Long id) {

        logger.info("criando mais uma pessoa!");

        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("nao encontrado este id"));
        repository.delete(entity);
    }

   /* private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name " + i);
        person.setLastName("Last name " + i);
        person.setAddress("some address in Brasil " + i);
        person.setGender("");
        return person;
    }*/

}
