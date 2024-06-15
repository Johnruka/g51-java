package Johncurrencyconverter;

import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayMenu();
        int choice = scanner.nextInt();
        performOperations(choice); //1


    }

    public static void displayMenu(){
        System.out.println("currency converter App");
        System.out.println("1. convert SEK to USD");
        System.out.println("2. convert USD to SEK");
        System.out.println("3. convert SEK to EURO");
        System.out.println("4. convert EURO to SEK");
        System.out.println("0. EXIT");
        System.out.println("Enter your choice: ");
    }

    public static void performOperations(int operationNumber){

        switch (operationNumber){
            case 1:
                System.out.println("operation 1 has been executed!");
                break;
            case 2:
                System.out.println("operation 2 has been executed!");
                break;
            case 3:
                System.out.println("operation 3 has been executed!");
                break;
            case 4:
                System.out.println("operation 4 has been executed!");
                break;
            case 0:
                System.out.println("Exiting the currency App. Goodbye.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
}
