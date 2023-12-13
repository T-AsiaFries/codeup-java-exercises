import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Ask Bob a question");
       String input = sc.nextLine();

        if (input.endsWith("?")) {
            System.out.println("Sure");
        } else if (input.endsWith("!")) {
            System.out.println("Woah, chill out!");
        } else if (input.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }
    }
}
