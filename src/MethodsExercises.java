import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(addingNums(5, 5));
        System.out.println(subtractingNums(15, 7));
        System.out.println(multiplyingNums(3, 8));
        System.out.println(dividingNums(56, 9));
        System.out.println(modulusNums(10, 3));

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("You entered: " + userInput);
        System.out.println(calculateFactorial(userInput));

        System.out.println("Enter the number of sides for a pair of dice: ");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        System.out.println("You entered: " + input);
        System.out.println("Rolling two " + input + "-sided dice...");
        System.out.println("Result of die 1: " + diceRoller(input));
        System.out.println("Result of die 2: " + diceRoller(input));
        System.out.println("Would you like to roll again? [y/n]");
        scanner.next();
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
    }

    //    (1)
//    ADDITION
    public static int addingNums(int a, int b) {
        return a + b;
    }

    //    SUBTRACTION
    public static int subtractingNums(int a, int b) {
        return a - b;
    }

    //    MULTIPLICATION
    public static int multiplyingNums(int a, int b) {
        return a * b;
    }

    //    DIVIDING
    public static int dividingNums(int a, int b) {
        return a / b;
    }

    //    MODULUS
    public static int modulusNums(int a, int b) {
        return a % b;
    }

    //    (2)
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Input out of range. Please enter a number between " + min + " and " + max + ".");
        }
        return userInput;
    }

    //    (3)
    public static long calculateFactorial(int n) {
        long factorialResult = 1;
        for (int i = 1; i <= n; i++) {
            factorialResult *= i;
        }
        return factorialResult;
    }

    //     (4)
    public static int diceRoller(int sides) {
        return (int) (Math.random() * sides) + 1;
    }

}




