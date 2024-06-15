package Johncurrencyconverter;

public class ExchangeOperations {

    public static double convertsekToUsd(double sekAmount) {
        return sekAmount * ExchangeRates.sekToUsdRate;
    }

    public static double convertUsdTosek(double usdAmount){
        return usdAmount * ExchangeRates.UsdTosekRate;

    }

    public static double convertsekToEuro(double sekAmount){
        return  sekAmount * ExchangeRates.sekToEuroRate;
    }

    public static double convertEuroTosek(double EuroAmount){
        return EuroAmount * ExchangeRates.EuroTosekRate;
    }



}
