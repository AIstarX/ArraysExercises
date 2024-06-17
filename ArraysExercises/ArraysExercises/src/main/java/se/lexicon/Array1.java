package se.lexicon;

public class Array1{
    public static void main(String[] args) {
        int[] numbers = {11, 23, 39, 58, 45, 32};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
