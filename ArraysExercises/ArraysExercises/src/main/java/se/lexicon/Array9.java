package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        int[] originalArray = {1, 15, 20};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to add to the array: ");
        int numberToAdd = scanner.nextInt();

        int[] expandedArray = addElement(originalArray, numberToAdd);

        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Expanded array: " + Arrays.toString(expandedArray));
    }

    public static int[] addElement(int[] arr, int element) {
        int[] newArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        newArray[arr.length] = element;
        return newArray;
    }
}
