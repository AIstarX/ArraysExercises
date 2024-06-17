package se.lexicon;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        int[] firstArray = {1, 15, 20};
        int[] secondArray = Arrays.copyOf(firstArray, firstArray.length);

        System.out.println("Elements from first array: " + Arrays.toString(firstArray));
        System.out.println("Elements from second array: " + Arrays.toString(secondArray));
    }
}
