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

        int option;

        do {


        System.out.println("===Converter App===");
        System.out.println("1.Length converter");
        System.out.println("2.Currency converter");
        System.out.println("3.Weight converter");
        System.out.println("4.Exit");
        System.out.println("Choose an option:");

        while (!scanner.hasNextInt()) {// A user must put an int
            System.out.println("Invalid input. Please choose from option 1 2 3 4: ");
            scanner.next();// throws away a bad input
            System.out.println("Enter your option");
        }

        option = scanner.nextInt();// must be here to display the options



        switch (option){// will choose from the options and convert
            case 1:
                lengthConverter(scanner);
               break;// to stop java from continuing calculations;

            case 2:
                currencyConverter(scanner);
                break;

            case 3:
                weightConverter(scanner);
               break;

            case 4:

                System.out.println("Goodbye!");
                break;//stops the loop


            default:
                System.out.println("Invalid option. Please choose between 1 2 3 4");

        }


        }
        while (option!=4);


    }

    static void lengthConverter(Scanner scanner){

        do {

            System.out.println("Input the meters:");

                double meters = scanner.nextDouble();
                double kilometers = meters/1000;
                double result = kilometers;
                System.out.println("Result is: " + meters + " M " +  "= " + result + "KM");
                LocalDateTime dateTime = LocalDateTime.now();
                System.out.println("Converted at: " + dateTime);


        } while (!scanner.hasNextDouble());{

            System.out.println("Invalid meters. Please enter a valid number");
            scanner.next();
            System.out.println("Enter meters: ");

        }
        double meters = scanner.nextDouble();//checks input before reading it. important, otherwise it will display an error message if it is not there



    }

    static void currencyConverter(Scanner scanner){

        do {


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

        } while (!scanner.hasNextDouble());{
            System.out.println("Invalid amount in SEK. Please enter a valid number");
            scanner.next();
            System.out.println("Enter amount in SEK: ");

        }
        double amountSEK = scanner.nextDouble();



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
