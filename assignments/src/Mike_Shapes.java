package assignments.src;

import java.util.Scanner;

public class Mike_Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write:");
        String shape = sc.nextLine();
        if (shape.equals("tri l") == true ) {
            System.out.println("*\n**\n***");
        }
        if (shape.equals("rect") == true ) {
            System.out.println("*****\n*****\n*****");
        }
        if (shape.equals("tri r") == true ) {
            System.out.println("  *\n **\n***");
        }
        sc.close();

    }
}