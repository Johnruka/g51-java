package se.lexicon;

import java.util.Arrays;

public class arraysEX4 {

    public static void main(String[] args) {
        int[] numbers = {20, 30, 40, 50, 60, 95,};
        int[] copy = Arrays.copyOf(numbers, numbers.length);

        System.out.println("original:\t" + Arrays.toString(numbers));
        System.out.println("copy:\t" + Arrays.toString(copy));
    }
}
