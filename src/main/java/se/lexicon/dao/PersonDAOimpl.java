package se.lexicon.dao;

import se.lexicon.AppUser;
import se.lexicon.Person;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonDAOimpl implements PersonDAO{

    private  List<Person> persons;

    public PersonDAOimpl(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public Person persist(Person person) {
       persons.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        for (Person p : persons) {
            if (p.getId()==id) {
                return p;
            }

        }
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        for (Person p : persons) {
            if (p.getEmail().trim().equalsIgnoreCase(email)) {
                return p;
            }

        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return Collections.unmodifiableCollection(persons);
    }

    @Override
    public void remove(Person id) {
        persons.remove(id);
    }
}
