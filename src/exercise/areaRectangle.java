package exercise;

import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width;
        int height;

        System.out.print("Please enter in a width: ");
        width = in.nextInt();
        System.out.print("Please enter in a height: ");
        height = in.nextInt();

        int area = width * height;

        System.out.println(String.format("Area: %1$s", area));

    }
}
