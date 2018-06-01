package exercises.Prep1;
import java.util.Scanner;

public class Dimensions {
    public static void main(String[] args) {
        // declare scanner
        Scanner input = new Scanner(System.in);

        // get data
        print("Please enter two numbers for dimensions: ");
        String data = input.nextLine();

        // check data
        if (data.trim().isEmpty()) {
            println("You've entered nothing");
            return;
        }
        String[] dimensions = data.split("\\s");
        int result = 0;
        for (String dimension :
                dimensions) {
            result += Integer.parseInt(dimension);
        }
        print(String.format("Result of the dimensions %s and %s is %d", dimensions[0], dimensions[1], result * 2));
    }

    private static void print(String s) {
        System.out.print(s);
    }

    private static void println(String s) {
        print(s + "\n");
    }
}
