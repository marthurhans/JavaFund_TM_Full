package com.mikehans.exercise8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void convertMethodAReturnsOne() {
        int num = Main.convert('a');
        assertEquals(1,num);
    }

    @Test
    public void convertMethodZReturnsTwentySix() {
        int num = Main.convert('z');
        assertEquals(26,num);
    }

    @Test
    public void convertMethodWReturnsTwentyThree() {
        int num = Main.convert('w');
        assertEquals(23,num);
    }

    @Test
    public void convertMethodFReturnsSix() {
        int num = Main.convert('a');
        assertEquals(1,num);
    }

    @Test
    public void convertMethodCReturnsOne() {
        int num = Main.convert('f');
        assertEquals(6,num);
    }

    @Test
    public void convertMethodHReturnsEight() {
        int num = Main.convert('h');
        assertEquals(8,num);
    }
}
