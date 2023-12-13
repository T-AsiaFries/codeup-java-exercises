public class StringExercise {
    public static void main(String[] args) {

//        STRING BASICS

        String needs = "We don't need no education";

        System.out.println(needs);
        System.out.println(needs.replace("education", "thought control"));

        String check = "Check \"this\" out!, \"s inside of \"s!";

        System.out.println(check);

        String windows = "In windows, the main drive is usually C:'";
        System.out.println(windows.replace("'", "\\"));

        String backlashes = "I can do backlashes ', double backlashes '', and the amazing triple backlash '''!";
        System.out.println(backlashes.replace("'", "\\"));

    }
}
