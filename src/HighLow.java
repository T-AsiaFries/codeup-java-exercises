import java.util.Scanner;

// (5)
public class HighLow {
    public static void main(String[] args) {
        System.out.println("Welcome to the High-Low guessing game!");
        System.out.println("I'm thinking of a number between 1 and 100. Do you know what it is?");
//        System.out.println(randomNum());
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int userGuess;
        do {
            System.out.print("Enter your guess: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid integer. Please enter a valid integer, try again!");
                System.out.print("Enter your guess: ");
                scanner.next();
            }
            userGuess = scanner.nextInt();
            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (userGuess < randomNumber) {
                System.out.println("HIGHER");
            } else if (userGuess > randomNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("YOU GOT IT! You guessed the correct number: " + randomNumber);
                break;
            }
        } while (true);
    }
}
