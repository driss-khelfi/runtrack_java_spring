package com.example.demo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void updatePerson(Person updatedPerson) {
    }

    public void deletePerson(Long id) {
    }

    // Placez ici la logique métier liée aux personnes
    // Par exemple, des méthodes pour créer, lire, mettre à jour et supprimer des personnes
}
