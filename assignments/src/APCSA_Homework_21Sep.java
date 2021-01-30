package assignments.src;

public class APCSA_Homework_21Sep {
    public static void main(String[] args) {
        predictions();
        results();
        sleepIn();
    }

    public static void predictions() {
        System.out.println("My results");
        System.out.println("a. " + "-5 + 8 * 6 = 43");
        System.out.println("b. " + "(55 + 9) % 9 = 1");
        System.out.println("c. " + "20 + -3 * 5 / 8 = 21");
        System.out.println("d. " + "5 + 15 / 3 * 2 - 8 % 3 = 13");
        System.out.println();
    }

    public static void results() {
        System.out.println("Java results");
        System.out.println("a. " + "-5 + 8 * 6 = " + (-5 + 8 * 6));
        System.out.println("b. " + "(55 + 9) % 9 = " + ((55 + 9) % 9));
        System.out.println("c. " + "20 + -3 * 5 / 8 = " + (20 + -3 * 5 / 8));
        System.out.println("d. " + "5 + 15 / 3 * 2 - 8 % 3 = " + (5 + 15 / 3 * 2 - 8 % 3));
        System.out.println();
    }

    public static void sleepIn() {
        boolean vacation = false;
        boolean weekday = true;
        boolean sleepIn = (weekday == false || vacation == true);
        System.out.println(sleepIn);

        vacation = true;
        weekday = false;
        sleepIn = (weekday == false || vacation == true);
        System.out.println(sleepIn);

        vacation = false;
        weekday = false;
        sleepIn = (weekday == false || vacation == true);
        System.out.println(sleepIn);

    }
}