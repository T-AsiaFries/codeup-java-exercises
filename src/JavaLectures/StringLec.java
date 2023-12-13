package JavaLectures;

import java.util.Scanner;

public class StringLec {
    public static void main (String[] args) {

//        IMMUTABILITY AND CONCATENATION

//        String message = "Hello";
//        System.out.println(message);
//        message = message + " World";
//        System.out.println(message);

//        String day = "Wednesday";
//        String day2 = new String("Wednesday");
//        System.out.println(day.equals(day2));

//        COMPARING STRINGS

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();

//        DONT DO THIS!
//        boolean confirmation = userInput == "y";
//        DO THIS!
//        boolean confirmation = userInput.equals("y");
//        System.out.println(confirmation);

// DON'T DO THIS!
//        if ("I am a string" == "I am a string") {
//            System.out.println("Strings are equal");
//        }


//        But in general we cannot rely on that behavior, and should use either the
//`equals` or `equalsIgnoreCase` method on a string object to compare string
//        values.


// DO THIS INSTEAD!
//        if ("I am a string".equals("I am a string")) {
//            System.out.println("Strings are equal");
//        }

//        STRING COMPARISON METHODS

//        .equals  ---> determine, case-sensitively, if two strings have the same value.
//        .equalsIgnoreCase	 ---> determine if two strings have the same value, disregarding their casing.
//        .startsWith  ---> determine, case-sensitively, if one string starts with another.
//        .endsWith	 ---> determine, case-sensitively, if one string ends with another.

        String input = "Codeup Rocks!";

        System.out.println(input.equals("codeup rocks!")); // false
        System.out.println(input.equals("Codeup Rocks!")); // true

        System.out.println(input.equalsIgnoreCase("codeup rocks!")); // true
        System.out.println(input.equalsIgnoreCase("CODEUP ROCKS!")); // true

        System.out.println(input.startsWith("codeup"));  // false
//        input.startsWith("Codeup") // true
//
//        input.endsWith("rocks") // false
//        input.endsWith("rocks!") // false
//        input.endsWith("Rocks!") // true

//        STRING MANIPULATION METHOD

        String manipulation = "String to manipulate";
        String trimTest = "   String to manipulate   ";

//        charAt ---> RETURNS THE CHARACTER AT THE SPECIFIED INDEX OF THE STRING
        System.out.println(manipulation.charAt(4));

//        .indexOf ---> RETURNS THE INDEX OF THE FIRST OCCURRENCE OF A CERTAIN SUBSTRING
        System.out.println(manipulation.indexOf("y"));
        System.out.println(manipulation.indexOf("i"));

//        .lastIndexOf ---> LIKE INDEXOF, BUT STARTS THE SEARCH FROM THE END OF THE STRING
        System.out.println(manipulation.lastIndexOf("n"));

//        .length ---> RETURNS THE LENGTH OF A STRING
        System.out.println(manipulation.length());

//        .replace ---> RETURNS A COPY OF THE STRING THAT HAS PATTERN REPLACED WITH REPLACEMENT
        System.out.println(manipulation.replace("manipulate", "change"));

//        substring ---> RETURNS A NEW SUBSTRING THAT STARTS AT A SPECIFIED INDEX AND (OPTIONALLY) ENDS AT THE SPECIFIED INDEX
        System.out.println(manipulation.substring(0, 6));
        System.out.println(manipulation.substring(6));

//        toLowerCase() & toUpperCase() ---> RETURNS A STRING THAT HAS EITHER ALL UPPERCASE OR LOWERCASE LETTERS
        System.out.println(manipulation.toLowerCase());
        System.out.println(manipulation.toUpperCase());

//        .trim ---> RETURNS A COPY OF THE STRING WITHOUT LEADING AND TRAILING WHITESPACES
        System.out.println(trimTest.trim());
    }
}
