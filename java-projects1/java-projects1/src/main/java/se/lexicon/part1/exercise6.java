package se.lexicon.part1;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        //Scanner object for to read the user input
        Scanner scanner= new Scanner(System.in);

        //Ask user to enter two numbers
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        //Performance the arithmetics operations
        int add = num1 + num2;
        int subtraction = num1 - num2;
        int division = num1 / num2;
        int product= num1 * num2;

        //Print the results
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " * " + num2 + " + " + product);
        System.out.println(num1 + " + " + num2 + " = " + add);

        //Close the Scanner object
        scanner.close();

    }
}
