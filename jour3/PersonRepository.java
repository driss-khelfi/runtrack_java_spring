package com.example.demo6;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    // Vous n'avez pas besoin de fournir de méthodes ici, sauf si vous avez des besoins spécifiques

    // Spring Data JPA générera automatiquement des méthodes pour les opérations CRUD (Create, Read, Update, Delete)
}
