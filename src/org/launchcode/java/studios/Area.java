package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float radius = GetRadius();

        Print(String.format("The area of the circle of radius %.3f is: %.3f", radius, GetArea(radius)));

    }

    private static float GetRadius() {
        Print("Enter a radius: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextFloat();
    }

    private static void Print(String s) {
        System.out.print(s);
    }

    private static float GetArea(float radius) {
        return (float) Math.PI * radius * radius;
    }
}
