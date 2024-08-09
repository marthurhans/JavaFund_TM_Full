package com.mikehans.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExerciseTest {
    public Exercise exercise1;
    String answer = null;

//    @BeforeEach
//    void setUp() {
//        exercise1 = new Exercise();
//    }



    @Test
    public void oneLetterNoCap() {
        exercise1 = new Exercise();
        answer = exercise1.alternateCapMaker("a");
        assertEquals("a", answer);
    }

    @Test
    public void twoLettersSecondOneCap() {
        exercise1 = new Exercise();
        answer = exercise1.alternateCapMaker("ap");
        assertEquals("aP", answer);
    }

    @Test
    public void threeLettersSecondOneCap() {
        exercise1 = new Exercise();
        answer = exercise1.alternateCapMaker("ccc");
        assertEquals("cCc", answer);
    }

    @Test
    public void allCapsConversion() {
        exercise1 = new Exercise();
        answer = exercise1.alternateCapMaker("CCCCCCC");
        assertEquals("cCcCcCc", answer);
    }

    @Test
    public void fourLettersEveryOtherOneCap() {
        exercise1 = new Exercise();
        answer = exercise1.alternateCapMaker("appl");
        assertEquals("aPpL", answer);
    }

    @Test
    public void sevenLettersEveryOtherOneCap() {
        exercise1 = new Exercise();
        answer = exercise1.alternateCapMaker("appleos");
        assertEquals("aPpLeOs", answer);
    }

    @Test
    public void blankString() {
        exercise1 = new Exercise();
        answer = exercise1.alternateCapMaker("");
        assertEquals("", answer);
    }
//
}
