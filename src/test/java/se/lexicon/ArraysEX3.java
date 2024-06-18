package se.lexicon;

import java.util.Arrays;

public class ArraysEX3 {
    public static void main(String[] args) {
        String[] CapitalCities = {"Paris","London","New York","Stockholm"};

        System.out.println("unsorted Arrays:\t" + Arrays.toString(CapitalCities));

        Arrays.sort(CapitalCities);

        System.out.println("sorted Arrays:\t" + Arrays.toString(CapitalCities));
    }
}
