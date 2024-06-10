package se.lexicon.part1;

import java.util.Random;
import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(500) + 1;

        Scanner scanner = new Scanner(System.in);

        int userGuess = 0;
        int numberOfTries = 0;

        while (userGuess!= randomNumber) {
            System.out.print("Guess the number (between 1 and 500): ");
            userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < randomNumber) {
                System.out.println("Your guess was too low.");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess was too high.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("It took you " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}
