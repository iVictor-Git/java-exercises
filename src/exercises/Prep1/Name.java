package exercises.Prep1;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        if (!name.trim().isEmpty()) System.out.println(String.format("Hello, %s", name));
        else System.out.println("You've entered an empty string");
    }
}
