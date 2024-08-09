package com.mikehans.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessingGameTest {

    public static final int GAME_RANDOMNESS_RETRIES = 100;
    private GuessingGame game;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testSimpleWinSituation () {
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum);
        assertEquals("You got it in 1 try", message);
    }

    @Test
    public void testOneWrongNegativeGuessSituation () {
        int randomNum = game.getRandomNumber();
        String message = game.guess(-5);
        assertEquals("You didn't get it - you're too low", message);
    }

    @Test
    public void testOneWrongPositiveGuessSituation () {
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum + 1);
        assertEquals("You didn't get it - you're too high", message);
    }

    @RepeatedTest(10)
    public void testRandomNumberGeneration () {
        // 1 2 3 4 5 6 7 8 9 10
        // 1 1 1 1   1   1 1  1 = 10
        int[] rndNumCount = new int[11];
        //int elements default to 0;
        for (int counter = 0; counter < GAME_RANDOMNESS_RETRIES; counter++) {
            GuessingGame localGame = new GuessingGame();
            int randomNum = localGame.getRandomNumber();
            rndNumCount[randomNum] = 1;
        }
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += rndNumCount[i];
        }
        assertEquals(10, sum);
    }


    @Test
    public void testThreeWrongGuessesAndOneCorrect() {
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        int correctAnswer = game.getRandomNumber();
        String message = game.guess(correctAnswer);
        assertEquals("You got it in 4 tries", message);
    }

    @Test
    public void testTwoWrongGuessesAndOneCorrect() {
        game.guess(-3);
        game.guess(-3);
        int correctAnswer = game.getRandomNumber();
        String message = game.guess(correctAnswer);
        assertTrue(message.contains(" 3 " ), "Should indicate 3 tries");
        assertTrue(message.contains("You got it"), "Should indicate that we got the right number");
        assertEquals("You got it in 3 tries", message);
    }

    @Test
    public void testFourWrongGuesses() {
        for (int i = 0; i < 3; i++) {
            game.guess(-3);
        }
        String message = game.guess(-3);
        assertEquals("You didn't get it and you had 4 tries. Game over.", message);
    }

    @Test
    public void testTenWrongGuesses() {
        for (int i = 0; i < 9; i++) {
            game.guess(-3);
        }
        String message = game.guess(-3);
        assertEquals("Sorry, you are limited to only 4 tries. Game over.", message);
    }

    @Test
    public void junkTest() {
        //with no assertEquals, this test always passes
    }


}
