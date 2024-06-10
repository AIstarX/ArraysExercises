package se.lexicon.part1;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        //Create a Scanner object for to read the user input
        Scanner scanner = new Scanner(System.in);

        //Ask the user to enter their name
        System.out.println("please enter your name: ");
        String username = scanner.nextLine();

        //Print the greetings
        System.out.println("Hello: " + username);

        //Close the Scanner object
        scanner.close();



    }
}
