package exercises;

import java.util.Scanner;

public class Miles {

    public static void main(String[] s) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many miles: ");
        int miles = in.nextInt();

        System.out.print("Gallons consumed: ");
        float gallons = in.nextFloat();

        float mpg = (float) miles / gallons;
        System.out.printf("%.2f", mpg);
    }
}
