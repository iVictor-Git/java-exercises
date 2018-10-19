package exercise;

import java.util.Scanner;

public class mph {
    public static void main(String[] args) {
        /*Write a program that asks a user for the number of miles they have driven and the amount of gas they've consumed (in gallons), and print their miles-per-gallon.*/
        Scanner in = new Scanner(System.in);

        print("Please enter miles: ");
        float miles = in.nextFloat();

        print("Please enter gallons: ");
        float gallons = in.nextFloat();

        float mph = miles / gallons;

        print(String.format("Your car has %1$.2f mph", mph));
    }

    private static void print(String phrase) {
        System.out.print(phrase);
    }
}
