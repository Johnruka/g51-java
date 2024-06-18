package se.lexicon;

import java.text.DecimalFormat;

public class ArraysEX6 {
    public static void main(String[] args) {
        double[] forAverage = {55, 35, 49, 73, 81, 97};
        double total = 0;

        for (double v : forAverage) {
            total += v;
        }

        DecimalFormat df = new DecimalFormat("###.#");
        System.out.println("Average is: " + df.format(total / forAverage.length));
    }
}
