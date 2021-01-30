package assignments.src;

/* Create a function that responds with the appropriate part of the day (morning, afternoon, night) to time of the Day.
Input - hourOfTheDay (0-24). Output check below.
[The String should be “morning” if time is on the interval from 5 to 12, 12 excluded.
From 12 to 17, it should be labeled “afternoon”.
For every other integer, it should be “night”.]
*/

import java.util.Scanner;

public class Mike_TimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 25; i++) {
            System.out.print("Enter time of day (hour): ");
            double timeOfDay = sc.nextDouble();
            if (timeOfDay >= 5 && timeOfDay < 12) {
                System.out.println("It's " + timeOfDay + " in the morning.");
            } else if (timeOfDay >= 12 && timeOfDay < 17) {
                System.out.println("It's " + timeOfDay + " in the afternoon.");            
            } else if (timeOfDay <= 24) {
                System.out.println("It's " + timeOfDay + " at night.");
            } else {
                System.out.println(timeOfDay + " is not a valid time.");
            }            
        }
        sc.close();
    }
}
