package Johncurrencyconverter;

public class ExchangeOperations {

    public static double convertsekToUsd(double sekAmount) {
        return sekAmount * ExchangeRates.setToUsdRates;
    }

    public static double convertUsdTosek(double usdAmount){
        return usdAmount * ExchangeRates.usdToSekRate;
    }

    public static double convertsekToEuro(double sekAmount) {
        return sekAmount * ExchangeRates.usdToSekRate;
    }

    public static double convertEuroTosek(double EuroAmount) {
        return EuroAmount * ExchangeRates.usdToSekRate;
    }

    // ...
}
