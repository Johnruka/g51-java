package Johncurrencyconverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.HashMap;
import java.util.Scanner;

public class displayMenu {

    private static final String GET_URL = ;
    private static final String URL = ;

    public static void main(String[] args) {

        HashMap<Integer, String> currencyCodes = new HashMap<Integer, String>();

        // Add currency codes

        currencyCodes.put(1, "USD");
        currencyCodes.put(2, "SEK");
        currencyCodes.put(3, "CAD");
        currencyCodes.put(4, "EUR");
        currencyCodes.put(5, "GBP");

        String fromCode, tocode;
        double amount;

        Scanner sc = new Scanner(System.in);

        System.out.println("This is Johns currency converter");

        System.out.println("Currency converting FROM?");
        System.out.println("1:US Dollar \t 2:Swedish krona \t 3:Canadian Dollar \t 4:EUR (Euro) \t 5:Great Britain Pound");
        fromCode = currencyCodes.get(sc.nextInt());

        System.out.println("Currency converting TO?");
        System.out.println("1:US Dollar \t 2:Swedish krona  \t 3:Canadian Dollar \t 4:EUR (Euro) \t 5:Great Britain Pound");
        tocode = currencyCodes.get(sc.nextInt());

        System.out.println("Amount you wish to convert?");
        amount = sc.nextFloat();

        //sendHttpGETRequest(fromCode, toCode, amount);

        System.out.println("Thank you for using the currency converter");

     }

     private static void sendHttpGetRequest(String fromCode, String toCode, double amount) throws IOException {

        String GET URL = "https:api.exchangeable.io/latest?base=" + toCode +"&symbols=" + fromCode;
        URL url = new URL(GET_URL);
         HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
         httpURLConnection.setRequestMethod("GET");
         int responseCode = httpURLConnection.getResponseCode();

         if (responseCode == HttpURLConnection.HTTP_OK) { //Success
             BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
             String inputLine;
             StringBuilder response = new StringBuilder();

             while ((inputLine = in.readLine()) != null){
                 response.append(inputLine);
             }in.close();
         }


    }
}

