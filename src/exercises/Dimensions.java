package exercises;

import java.util.Scanner;

public class Dimensions {
    public static void main(String[] s) {

        Scanner in = new Scanner(System.in);

        AskDimension();
        int width = AskSize("Width", in);
        int length = AskSize("Length", in);

        CalculateArea(width, length);
    }

    private static void AskDimension() {
        System.out.println("What are the dimensions?");
    }

    private static int AskSize(String s, Scanner scanner) {
        System.out.print(String.format("%s: ", s));
        return scanner.nextInt();
    }

    private static void CalculateArea(int w, int l) {
        System.out.printf("Area: %d", w * l);
    }
}
