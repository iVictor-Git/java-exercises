package exercises;

import java.util.Scanner;

public class Hello {

    public static void  Main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name = in.nextLine();

        PrintName(name);


    }

    private static void PrintName(String s) {
        System.out.print(String.format("Hello, %s", s));
    }
}
