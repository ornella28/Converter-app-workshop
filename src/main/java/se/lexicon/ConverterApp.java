package se.lexicon;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class ConverterApp {
    Scanner scanner = new Scanner(System.in);// will collect all the input




    //code to be used to handle wrong input
    public static int readOption(Scanner scanner){//code to be used to handle wrong input
        while (!scanner.hasNextInt()){
            System.out.println("Invalid option. please option 1 2 or 3: ");
            scanner.next();//removes bad input
            System.out.println("Enter an option: ");


        }
        return scanner.nextInt(); // gives back the input



    }

    void main(){



        System.out.println("===Converter App===");
        System.out.println("1.Length converter");
        System.out.println("2.Currency converter");
        System.out.println("3.");
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

        }






    }

    static void lengthConverter(Scanner scanner){

        System.out.println("Input the meters:");
        double meters = scanner.nextDouble();
        double kilometers = meters/1000;
        double result = kilometers;
        System.out.println("Result is: " + meters + " meters " + "to kilometers" +  "= " + result + "kilometers");
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Converted at: " + today);

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
        LocalDateTime today = LocalDateTime.now();

        System.out.println("Result is: " + amountSEK + " SEK "  +  "= " + resultUSD + "USD");
        System.out.println("Result is: " + amountSEK + " SEK "  +  "= " + resultEUR + "EUR");
        System.out.println("Converted at: " + today);



    }
}
