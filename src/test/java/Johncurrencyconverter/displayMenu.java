package Johncurrencyconverter;

import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

public class displayMenu {

    public static void main(String[] args) {

        HashMap<Integer, String> currencyCodes = new HashMap<Integer, String>();

        // Add currency codes

        currencyCodes.put(1, "SEK");
        currencyCodes.put(2, "USD");
        currencyCodes.put(3, "CAD");
        currencyCodes.put(4, "EUR");
        currencyCodes.put(5, "GBP");

        String fromCode, tocode;
        double amount;

        Scanner sc = new Scanner(System.in);

        System.out.println("This is Johns currency converter");

        System.out.println("Currency converting FROM?");
        System.out.println("1:Swedish krona \t 2:US Dollar \t 3:Canadian Dollar \t 4:EUR (Euro) \t 5:Great Britain Pound");
        fromCode = currencyCodes.get(sc.nextInt());

        System.out.println("Currency converting TO?");
        System.out.println("1:Swedish krona \t 2:US Dollar \t 3:Canadian Dollar \t 4:EUR (Euro) \t 5:Great Britain Pound");
        tocode = currencyCodes.get(sc.nextInt());

        System.out.println("Amount you wish to convert?");
        amount = sc.nextFloat();

        //sendHttpGETRequest(fromCode, tocode, amount);

        System.out.println("Thank you for using the currency converter");

     }

     private static void sendHttpGetRequest(String fromcode, String toCode, double amount){

        String GET URL = "https://api.exchangeratesapi.io/latest?base=" + toCode
    }
}
