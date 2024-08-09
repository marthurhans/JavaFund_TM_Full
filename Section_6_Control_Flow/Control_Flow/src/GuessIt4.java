import java.util.Random;
import java.util.Scanner;

public class GuessIt4 {
    public static final int MAX_ALLOWED_TRIES = 4;

    public static void main(String[] args) {

//        String guessedNumString = System.console().readLine("Please guess a number btwn 1 and 10");
        Scanner scan = new Scanner(System.in);
        int randomNum = new Random().nextInt(10) + 1;
        System.out.printf("%%Random number is %d,%n", randomNum);
        String guessedNumString = null;
        int count = 1;
//        do {
        for (; count<MAX_ALLOWED_TRIES; count++) {
            System.out.println("Please guess a number btwn 1 and 10");
            guessedNumString = scan.nextLine();
            if("q".equals(guessedNumString)){
                break;
            }
            if (guessedNumString.matches("-?\\d{1,2}")) {
                int guessedNum = Integer.parseInt(guessedNumString);
                if(guessedNum == randomNum) {
                    String tryText = count == 1 ? "try" : "tries";
                    System.out.println(StringTemplate.STR."The random number was \{randomNum}. You got it in !");
                    System.out.printf("You guessed %d in %d %s!%n", randomNum, count, tryText);
                    break;
                } else {
                    System.out.println("You did NOT get it!".toUpperCase());
                    System.out.printf("There are %d guesses left%n", (3 - count));

                }
            }
        }


//        } while (!"q".equals(guessedNumString) && count < MAX_ALLOWED_TRIES);
        if(count >= MAX_ALLOWED_TRIES) {
            System.out.println("\nYou are out of guesses!");
        }
        System.out.println("Thanks for playing - Goodbye!");
        scan.close();
    }
}
