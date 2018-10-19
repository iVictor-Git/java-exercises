package exercise;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = in.nextLine();

        System.out.println(String.format("Hello %1$s", name));

    }
}
