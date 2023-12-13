import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        FIRST EXERCISE
//        (a)
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//        REFACTOR USING FOR LOOP
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        (b)
//        int counter = 0;
//        do {
//            System.out.println(counter);
//            counter += 2;
//        } while (counter <= 100);
//       REFACTOR USING FOR LOOP
//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//        }
//        REFACTORED COUNTING BACKWARDS BY 5's FROM 100 to -10
//        int counter = 100;
//        do {
//            System.out.println(counter);
//            counter -= 5;
//        } while (counter >= -10);
//         int i = 2;
//         do {
//             System.out.println(i);
//           i += i * i;
//         } while (i < 1000000);

//         SECOND EXERCISE
//        for (int i = 1; i <= 100; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("Fizzbuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//
//        }

//        THIRD EXERCISE
//        Scanner scanner = new Scanner(System.in);
//        boolean confirm;
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInt = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for(int i = 1; i <= userInt; i++){
//                int square = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%-7s|%-9s|%-6s\n", i, square, cubed);
//            }
//            System.out.println("Continue? [y/n]");
//            confirm = scanner.next().equalsIgnoreCase("y");
//        }while(confirm);
//        System.out.println("Bye!");
//
////        FOURTH EXERCISE
//        do {
//            System.out.println("Enter a numerical grade from 0 to 100: ");
//            int userGrade = scanner.nextInt();
//
//            if(userGrade >= 88 && userGrade <= 100) {
//                System.out.println("A");
//            }else if(userGrade >= 80 && userGrade <= 87) {
//                System.out.println("B");
//            }else if(userGrade >= 67 && userGrade <= 79) {
//                System.out.println("C");
//            }else if(userGrade >= 60 && userGrade <= 66) {
//                System.out.println("D");
//            }else {
//                System.out.println("F");
//            }
//            System.out.println("Continue? [y/n]");
//            confirm = scanner.next().equalsIgnoreCase("y");
//        }while(confirm);
//        System.out.println("Alright, thanks!");
    }
}
