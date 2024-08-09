package com.mikehans.game;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private final int randomNumber = new Random().nextInt(10)+1;
    private int counter = 0;


    public String guess(int guessedNumber) {
        counter++;
        String tryText = counter == 1 ? "try" : "tries";
        String winningMsg = String.format("You got it in %d %s", counter, tryText);

        String response = null;
        if(counter == 4 && guessedNumber != getRandomNumber()) {
            response = String.format("You didn't get it and you had %d %s. Game over.", counter, tryText);
        } else if (counter > 4) {
            response = "Sorry, you are limited to only 4 tries. Game over.";
        } else {
            String tooHighLowText = null;
            if (guessedNumber < getRandomNumber()) {
                tooHighLowText = "- you're too low";
            } else if (guessedNumber > getRandomNumber()) {
                tooHighLowText = "- you're too high";
            } else {
                tooHighLowText = "";
            }
            String loseText = String. format("You didn't get it %s", tooHighLowText).trim();
            response = guessedNumber == getRandomNumber() ? winningMsg : loseText;
        }
        return response;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessingGame game = new GuessingGame();

        boolean loopShouldContinue = true;
        do {
            System.out.println("Enter a number :  ");
            String input = scanner.nextLine();
            if ("q".equals(input)) {
                break;
            }
            String output = game.guess(Integer.parseInt(input));
            System.out.println(output);
            if (output.contains("You got it") || output.contains("over")) {
                loopShouldContinue = false;
            }
        } while (loopShouldContinue);



        scanner.close();
    }
}
