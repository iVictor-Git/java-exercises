package exercises.Prep1;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String alice = new StringBuilder()
                .append("Alice was beginning to get very tired of sitting by her sister on the bank, and of having ")
                .append("nothing to do: once or twice she had peeped into the book her sister was reading, but it had no ")
                .append("pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures ")
                .append("or conversation?'")
                .toString();
        
        System.out.println(alice);
        System.out.print("Please enter a search term: ");
        Scanner input = new Scanner(System.in);

        String search = input.nextLine();

        if (search.trim().isEmpty()) {
            System.out.println("You did not enter a search term, terminating...");
            return;
        }
        int result = alice.toLowerCase().indexOf(search.toLowerCase());
        System.out.println(result);
        if (result > -1) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
