package se.lexicon;

public class ArraysEX7 {
    public static void main(String[] args) {
        int[] arrays = {5, 6, 3, 4, 7, 15};

        System.out.println("Arrays");
        for (int j : arrays) {
            System.out.println("" + j);
        }

        System.out.println("\nOdd Array:");
        for (int j : arrays) {
            if (j % 2 != 0) {
                System.out.println(" " + j);
            }
        }

    }
}
