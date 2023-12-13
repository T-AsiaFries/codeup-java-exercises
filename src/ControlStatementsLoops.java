import java.util.Scanner;

public class ControlStatementsLoops {

    //    MAIN METHOD THAT RUNS YOUR APPLICATION
    public static void main(String[] args) {
//    -------BOOLEAN EXPRESSIONS-------
        System.out.println(10 > 5);
        System.out.println(5 == 5);
        System.out.println(true == false);
        System.out.println();
        System.out.println(2 <= 2);

//     -------LOGICAL OPERATORS-------
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        if (isLoggedIn && isAdmin) {
            System.out.println("admin page");
        }
        System.out.println((true == true) || true == false);

//      -------STRING COMPARISON------
//        SCANNER IS EQUIVALENT TO A PROMPT || (System.in) TELLING IT TO GRAB THE USER INPUT FROM THE CONSOLE
        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/n] ");
//        STRINGS ARE OBJECTS IN JAVA
//        STORING THE USERS INPUT
        String userInput = sc.next();

//        boolean confirmation = userInput == "y";
//        System.out.println(userInput.equals("y"));
        System.out.println(userInput == "y");

        String firstName = "John";
        String lastName = "John";

        System.out.println(firstName == lastName);

//        --------CONTROL STRUCTURE-------

//       *** IF STATEMENTS ***
        boolean lectureTime = true;
        if (lectureTime) {
            System.out.println("learning something");
        } else {
            System.out.println("this will always run");
        }

        boolean learningJava = true;
        boolean learningJavaScript = true;
        boolean learningHTML = true;

        if (learningJava && learningJavaScript && learningHTML) {
            System.out.println("Learning JAVA, JavaScript, HTML");
        } else if (learningJavaScript) {
            System.out.println("Learning JavaScript");
        } else if (learningHTML) {
            System.out.println("Learning HTML");
        } else if (learningJava) {
            System.out.println("Learning JAVA");
        } else {
            System.out.println("Learning something else");
        }

//        *** SWITCH STATEMENTS ***
        int caseSwitch = 1;
        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                // Fall through!
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }
//        OR ADVANCED (SIMPLIFIED) STATEMENTS
//        switch (caseSwitch) {
//            case 1 -> System.out.println("Case 1");
//            case 2 -> System.out.println("Case 2");
//            default -> System.out.println("Default case");
//        }

//        *** WHILE LOOP ***
//        int i = 11;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        *** DO WHILE LOOP ***
//        do {
//            System.out.println("i is " + i);
//            i++;
//        } while (i < 10);

//      *** FOR LOOP ***
        for (int i = 0; i < 20; i++) {
           if (i == 7) {
               System.out.println("That is a lucky number");
               continue;
           }
           if (i == 9) {
               System.out.println("break the loop");
               break;
           }
           System.out.println("i = " + i);
        }

    }
}

