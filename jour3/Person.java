package com.example.demo6;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Person {
    @Id
    private Long id;

    private String name;
    private int age;

}
