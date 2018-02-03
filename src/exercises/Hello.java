package exercises;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        AskName();

        String name = in.nextLine();

        PrintName(name);


    }

    private static void PrintName(String s) {
        System.out.print(String.format("Hello, %s", s));
    }

    private static void AskName() {
        System.out.print("Who are you? ");
    }
}
