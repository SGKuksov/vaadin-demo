package ru.ntik.views;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.List;

public class MockData {

    private static class Person implements Serializable {
        private final String name;
        private final int yearOfBirth;

        public Person(String name, int yearOfBirth) {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }

        public String getName() {
            return name;
        }

        public int getYearOfBirth() {
            return yearOfBirth;
        }

        @Override
        public String toString() {
            var user = new JSONObject();

            try {
                user.put("name", name);
                user.put("yearOfBirth", yearOfBirth);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }

            return user.toString();
        }
    }

    static List<String> getData() {
        return List.of(
            new Person("Nicolaus Copernicus", 1543).toString(),
            new Person("Galileo Galilei", 1564).toString(),
            new Person("Johannes Kepler", 1571).toString(),
            new Person("Johannes Kepler", 1571).toString()
        );
    }
}
