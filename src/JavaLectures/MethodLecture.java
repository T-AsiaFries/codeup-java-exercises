package JavaLectures;

import java.util.Scanner;

public class MethodLecture {
    public static void main(String[] args) {

//        CALLING THE METHOD EXAMPLES WE MADE BELOW

        System.out.println(startingApplication());
        System.out.println(addingNums(4, 6));
        System.out.println(birthday("T-Asia", 25));
        System.out.println(sayHello());
        System.out.println(sayHello("Goodnight", "Fries"));
        System.out.println(sayHello( "Fries"));
//        String changeMe = "hello codeup!";
//        System.out.println(changeMe);
        count(10);
        int base = 2;
        int exponent = 3;
        long result = getPower(2, 3);
        System.out.println(base + " ^ " + exponent + " = " + result);
        iSpy("chair", "sit on it");
    }

//    Defining Methods
//    - Methods are similar to functions, meaning it is built to perform a specific task
//    - Similar to functions in JS, methods accept parameters and produce an output

//    Basic Syntax:
//    public static returnType methodName([param1[, param2[, ...]]) {
    // the statements of the method
    // a return statement, if a return type is declared
//    }

//        * public: is the visibility modified
//            - shows that this method can be accessed by code outside of the class
//        * static:
//            - When declared it states the method belongs to the class rather than a specific instance.
//            - Meaning it can be called without creating an instance of the class.
//            - Allows a method, to be called before an object of the class is created,
//            - Static Methods can: access static data directly & call other static methods only
//
//        * returnType:
//            - THis is the return type of the method
//            - All methods must define the type of the value they will return
//            - If there is no return, use the special keyword 'void'

//        * methodName
//            - The name of the function/method

//        * param1:
//             Parameters the method accepts
//            - A method can have no parameters, one parameters, or multiple parameters.
//            - Must include the type that specifies each parameter.
//            * Everything inside the curly braces is the body of the method.
//
//        - When building methods, they will need to be on the outside of the main method.

//    EXAMPLES:

//    EXAMPLE OF NO PARAMETER
    public static String startingApplication() {
        return "Starting my application";
    }

//    EXAMPLE WITH 2 PARAMETERS
//    public static String sayHello(String greeter, String name) {
//        return greeter + " " + name;
//    }

//    CREATE A METHOD THAT TAKES IN TWO NUMBERS AND RETURNS THE SUM OF THE NUMBERS
    public static int addingNums(int a, int b) {
        return a + b;
    }

//    CREATE A METHOD THAT TAKES IN TWO PARAMETERS, FIRST ONE IS A NAME AND THE SECOND ONE IS THE AGE. RETURN NAME + AGE
    public static String birthday(String name, int age) {
        return name + " " + age;
    }

//    SAME EXAMPLE WITH A FORMAT FOR NAME AND AGE

//    public static String birthday(String name, int age) {
//        return String.format("Happy Birthday %s! You're %d years old!", name, age);
//    }

//    METHOD OVERLOADING
//    EXAMPLES

    public static String sayHello() {
        return "Hello Hello";
    }

    public static String sayHello(String greeter, String name) {
        return greeter + " " + name;
    }

    public static String sayHello(String name) {
        return name;
    }

//    public static String changeString(String s) {
//        s = "Wub a lub a dub dub";
//        System.out.println(s);
//    }

//    RECURSION
//    A PROBLEM-SOLVING TECHNIQUE IN PROGRAMMING
//    IS A CONCEPT THAT AIMS TO SOLVE A PROBLEM BY DIVIDING IT INTO SMALLER CHUNKS
//    CREATING A METHOD THAT CALLS ITSELF, BUT WITH DIFFERENT PARAMETERS THAN WERE ORIGINALLY PASSED
//    YOU MUST MAKE SURE TO HAVE A BASE CAP OR STOP CONDITION SO THAT THE METHOD DOESNT CALL ITSELF OVER AND OVER AGAIN INDEFINITELY

    public static void count(int n) {
//        (BASE CASE) THE IF CONDITION
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

//    public static long getPower(int base, int exponent) {
//        long result = 1;
//        for (int i = 1; i <= exponent; i++) {
//            result = result * base;
//        }
//        return result;
//    }

    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }

//    I-SPY

    public static void iSpy(String objectToFind, String hint) {
        System.out.println("Player1: I spy with my little eyes something " + hint.concat("!"));
        Scanner spyaneer = new Scanner(System.in);
        String guess = spyaneer.nextLine();
        System.out.println("Player 2: I spy with my little eyes " + guess);

        if (guess.equalsIgnoreCase(objectToFind)) {
            System.out.println("You won!");
            return;
        }
        System.out.println("Keep guessing!");
        iSpy(objectToFind, hint);
    }

}