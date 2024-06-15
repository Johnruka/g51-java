package Johncurrencyconverter;

public class ExchangeOperations {

    public static double convertSekToUsd(double sekAmount) {
        return sekAmount * ExchangeRates.sekToUsdRate;
    }

    public static double convertUsdToSek(double usdAmount){
        return usdAmount * ExchangeRates.UsdToSekRate;

    }

    public static double convertSekToEuro(double sekAmount){
        return  sekAmount * ExchangeRates.sekToEuroRate;
    }

    public static double convertEuroToSek(double EuroAmount){
        return EuroAmount * ExchangeRates.EuroToSekRate;
    }



}
