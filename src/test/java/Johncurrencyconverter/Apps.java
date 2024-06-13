package Johncurrencyconverter;

public class Apps {
    public static void main(String[] args) {

        double sekAmount = 100;
        double sekToUsd = ExchangeOperations.convertsekToUsd(sekAmount);
        System.out.println(sekToUsd);
    }
}
