package ru.ntik.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class Person implements Serializable {

    public Person(String name, int yearOfBirth) {
        this.id = name;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    private final String id;
    private final String name;
    private final int yearOfBirth;
}
