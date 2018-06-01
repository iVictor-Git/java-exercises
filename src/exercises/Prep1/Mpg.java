package exercises.Prep1;
import java.util.Scanner;

public class Mpg {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter miles driven: ");
            String miles = input.nextLine();

            System.out.print("Please enter gas consumed (in gallons): ");
            String gallons = input.nextLine();

            if (miles.trim().isEmpty() || gallons.trim().isEmpty()) {
                System.out.println("You've entered an nothing in either the miles driven or the gallons consumed");
                return;
            }

            float milesConverted = Float.parseFloat(miles);
            float gallonsConverted = Float.parseFloat(gallons);

            System.out.println(String.format("MPG: %.2f", milesConverted/gallonsConverted));
        }
}
