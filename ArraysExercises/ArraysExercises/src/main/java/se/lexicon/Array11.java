package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Array11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[0];
        int input;

        do {
            System.out.print("Enter an integer (or 0 to finish): ");
            input = scanner.nextInt();
            if (input != 0) {
                numbers = addElement(numbers, input);
            }
        } while (input != 0);

        System.out.println("Original array: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }

    public static int[] addElement(int[] arr, int element) {
        int[] newArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        newArray[arr.length] = element;
        return newArray;
    }
}
