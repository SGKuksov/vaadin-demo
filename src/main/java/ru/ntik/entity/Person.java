package ru.ntik.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class Person implements Serializable {
    private final String name;
    private final int yearOfBirth;
}
