package se.lexicon;

public class Array2{

    public static int indexOf(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {11, 23, 5, 58, 45, 32};
        int target = 5;

        int index = indexOf(numbers, target);

        if (index != -1) {
            System.out.println("Index position of number " + target + " is: " + index);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
    }
}

