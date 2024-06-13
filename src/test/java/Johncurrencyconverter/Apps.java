package Johncurrencyconverter;

import java.util.Scanner;

public class Apps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayMenu();
        int choice = scanner.nextInt();

        // performOperations

        // step 1 : display menu
        // step 2 : get the user choice from the scanner
        // step 3 : perform operations

    }

    public static void displayMenu(){
        System.out.println("Currency Converter App");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("0. EXIT");
        System.out.println("Enter your choice:");
    }
}
