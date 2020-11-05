import java.util.Scanner;

public class Mike_DecToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal integer");
        int decimal = sc.nextInt();
        System.out.println(decimal + " is equal to " + Integer.toBinaryString(decimal) + " in binary");
        sc.close();
    }
}
