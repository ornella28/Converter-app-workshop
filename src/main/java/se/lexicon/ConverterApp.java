package se.lexicon;

import java.util.Scanner;

public class ConverterApp {
    Scanner scanner = new Scanner(System.in);// will collect all the input



    //code to be used to handle wrong input
    public static int readOption(Scanner scanner){//code to be used to handle wrong input
        while (!scanner.hasNextDouble()){
            System.out.println("Invalid option. please option 1 2 or 3: ");
            scanner.next();//removes bad input
            System.out.println("Enter an option: ");

        }
        return scanner.nextInt(); // gives back the input



    }

    void main(){



        System.out.println("===Converter App===");
        System.out.println("--------------------");
        System.out.println("1.Length converter");
        System.out.println("2.Weight converter");
        System.out.println("3.");
        System.out.println("4.Exit");
        System.out.println("Choose an option:");


        int option = scanner.nextInt();

        switch (option){// will choose from the options and convert
            case 1:
                lengthConverter(scanner);

        }






    }

    static void lengthConverter(Scanner scanner){

        System.out.println("Input the meters:");
        double meters = scanner.nextDouble();
        double kilometers = meters/1000;
        double result = kilometers;
        System.out.println("Result is: " + meters + " meters " + "to kilometers" +  "= " + result + "kilometers");

    }
}
