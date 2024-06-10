package se.lexicon.part1;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {

        //Create a Scanner object for read the user input
        Scanner scanner = new Scanner(System.in);

        //Ask user to enter seconds
        System.out.println("Enter the number of seconds: ");
        int totalSeconds = scanner.nextInt();

        //Calculate hours
        int hours = totalSeconds / 3600;

        //" " remaining minutes
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;

        //" " remaining seconds
        int seconds = remainingSeconds % 60;

        //Print the results in the format hh:mm:ss
        System.out.println(hours + ":" + minutes + ":" + seconds);

        scanner.close();

            }

}
