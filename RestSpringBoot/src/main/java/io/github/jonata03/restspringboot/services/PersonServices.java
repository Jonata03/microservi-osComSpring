package io.github.jonata03.restspringboot.services;

import io.github.jonata03.restspringboot.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id){
        logger.info("procurando uma pessoa");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("jonata");
        person.setLastName("araujo");
        person.setAddress("rua marchal rondones");
        person.setGender("male");
        return person;
    }
}
