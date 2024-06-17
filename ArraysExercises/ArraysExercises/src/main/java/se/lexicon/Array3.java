package se.lexicon;

import java.util.Arrays;

public class Array3{
    public static void main(String[] args) {
        String[] cities = {"Paris", "London", "New York", "Stockholm"};

        System.out.println("Original string array: " + Arrays.toString(cities));
        Arrays.sort(cities);
        System.out.println("Sorted string array: " + Arrays.toString(cities));
    }
}
