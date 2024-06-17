package se.lexicon;

public class Array7 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 7, 9, 12};

        System.out.println("Array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nOdd Array:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}
