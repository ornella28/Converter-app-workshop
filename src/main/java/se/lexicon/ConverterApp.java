package se.lexicon;

import java.util.Scanner;

public class ConverterApp {



    Scanner scanner = new Scanner(System.in);// reads input

    //code to be used to handle wrong input
    public static double readOption(Scanner scanner){//code to be used to handle wrong input
        while (!scanner.hasNextDouble()){
            System.out.println("Invalid option. please option 1 2 or 3: ");
            scanner.next();//removes bad input
            System.out.println("Enter an option: ");

        }
        return scanner.nextDouble(); // gives back the input



    }

    void main(){

        System.out.println("===Converter App===");
        System.out.println("--------------------");
        System.out.println("1.Length converter");
        System.out.println("2.Weight converter");
        System.out.println("3.");
        System.out.println("Choose an option:");
        double option1 = scanner.nextDouble();

        double option2 = scanner.nextDouble();


    }

    static void lengthConverter(){
        //double kilometers = meters / 1000;
        //double result;
        System.out.println("");


    }
}
