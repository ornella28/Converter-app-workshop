package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class ConverterApp {
    Scanner scanner = new Scanner(System.in);// will collect all the input


    //code to be used to handle wrong input
   /* public static int readOption(Scanner scanner){//code to be used to handle wrong input
        while (!scanner.hasNextInt()){
            System.out.println("Invalid option. please option 1 2 or 3: ");
            scanner.next();//removes bad input
            System.out.println("Enter an option: ");


        }
        return scanner.nextInt(); // gives back the input



    }*/

    void main(){



        System.out.println("===Converter App===");
        System.out.println("1.Length converter");
        System.out.println("2.Currency converter");
        System.out.println("3.Weight converter");
        System.out.println("4.Exit");
        System.out.println("Choose an option:");


        int option = scanner.nextInt();

        switch (option){// will choose from the options and convert
            case 1:
                lengthConverter(scanner);
                break;

            case 2:
                currencyConverter(scanner);
                break;

            case 3:
                weightConverter(scanner);
                break;

            default:
                System.out.println("Invalid option. Please choose option 1 2 or 3: ");


        }






    }

    static void lengthConverter(Scanner scanner){

        System.out.println("Input the meters:");
        double meters = scanner.nextDouble();
        double kilometers = meters/1000;
        double result = kilometers;
        System.out.println("Result is: " + meters + " M " +  "= " + result + "KM");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Converted at: " + dateTime);



    }

    static void currencyConverter(Scanner scanner){
        System.out.println("Input the amount in SEK");
        double exchangeRateUSD = 0.11;
        double exchangeRateEUR = 0.09;
        double amountSEK = scanner.nextDouble();
        double amountUSD = amountSEK * exchangeRateUSD;
        double amountEUR = amountSEK * exchangeRateEUR;
        double resultUSD = amountUSD;
        double resultEUR = amountEUR;


        System.out.println("Result is: " + amountSEK + " SEK "  +  "= " + resultUSD + "USD");
        System.out.println("Result is: " + amountSEK + " SEK "  +  "= " + resultEUR + "EUR");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Converted at: " + dateTime);



    }

    static void weightConverter(Scanner scanner){
        System.out.println("Input the weight in KG:");
        double kilograms = scanner.nextDouble();
        double grams = kilograms * 1000;
        double result = grams;
        System.out.println("Result is: " + kilograms + " KG " +  "= " + result + "Grams");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Converted at: " + dateTime);


    }
}
