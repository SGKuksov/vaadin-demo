package ru.ntik.views;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.ntik.entity.Person;

import java.util.Collection;
import java.util.List;

public class MockData {
    public static String getData() {

        try {
            ObjectMapper om = new ObjectMapper();
            return om.writeValueAsString(getMockObjectData());
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Oops...");
        }
    }

    private static Collection<Object> getMockObjectData() {
        return List.of(new Person("Nicolaus Copernicus", 1543),
                new Person("Galileo Galilei", 1564),
                new Person("Johannes Kepler", 1571),
                new Person("Johannes Kepler", 1571));
    }
}
