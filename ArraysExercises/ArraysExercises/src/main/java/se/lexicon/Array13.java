package se.lexicon;

import java.util.Arrays;
import java.util.Random;

public class Array13{
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Números aleatorios del 0 al 99
        }

        System.out.println("Original array: " + Arrays.toString(numbers));
        arrangeEvenOdd(numbers);
        System.out.println("Arranged array: " + Arrays.toString(numbers));
    }

    public static void arrangeEvenOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 == 1 && left < right) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
