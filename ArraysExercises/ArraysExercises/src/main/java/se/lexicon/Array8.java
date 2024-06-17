package se.lexicon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array8 {
    public static void main(String[] args) {
        int[] numbers = {20, 20, 40, 20, 30, 40, 50, 60, 50};

        System.out.println("Original array: " + Arrays.toString(numbers));
        int[] uniqueNumbers = removeDuplicates(numbers);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueNumbers));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        return uniqueSet.stream().mapToInt(Integer::intValue).toArray();
    }
}

