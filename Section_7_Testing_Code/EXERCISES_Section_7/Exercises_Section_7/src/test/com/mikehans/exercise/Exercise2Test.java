package com.mikehans.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class Exercise2Test {
    Exercise2 person;

    @Test
    public void canConvertCSVToPerson() {
        Exercise2 person = Exercise2.convert("Billy, Bob, 1234 Big St., Big City, California, 90210");
        assertEquals(person, new Exercise2("Billy", "Bob", "1234 Big St.", "Big City", "California", "90210"));
    }

    @Test
    public void canConvertMultiCSVtoPeople() {
        String multiCSV = "Billy, Bob, 1234 Big St., Big City, California, 90210|Jackson, Joe, 4321 Little St., Little City, New York, 20109";
        Exercise2[] people = Exercise2.convertMulti(multiCSV);
        Exercise2[] expPeople = {
                new Exercise2("Billy", "Bob", "1234 Big St.", "Big City", "California", "90210"),
                new Exercise2("Jackson", "Joe", "4321 Little St.", "Little City", "New York", "20109")
        };
        assertArrayEquals(expPeople, people);
    }
}
