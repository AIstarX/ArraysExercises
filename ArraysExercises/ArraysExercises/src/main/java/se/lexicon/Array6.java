package se.lexicon;

public class Array6 {
    public static void main(String[] args) {
        int[] numbers = {43, 5, 23, 17, 2, 14};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average is: " + average);
    }
}
