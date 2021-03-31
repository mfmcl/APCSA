package assignments.src;

/**
 * Create a static method that generates a random former ISBN number following
 * the below format.
 * 
 * The former International Standard Book Number (ISBN) was a 10-digit unique
 * code for a specific book. The rightmost digit is a checksum digit that was
 * determined by the rest of the numbers on his left side. The whole code is
 * divisible by 11. Therefore last digit (control checksum) is competent to this
 * sum of the first nine numbers. ISBN can contain any digit from 0 to 9 and 10.
 * Where 10 is marked as capital ‘X’ The checksum of 020131452 is number 5. So
 * the ISBN number is 0201314525
 * 10.0+9.2+8.0+.7.1+6.3+5.1+4.4+3.5+2.2+1.checkdigit=88
 * 
 * If possible, do not use Array
 */

public class ISBN {
    public static void main(String[] args) {
        String isbn = "";
        for (int i = 0; i < 9; i++) {
            isbn += (int) (Math.random() * 10);
        }
        int temp = Integer.parseInt(isbn);
        int sum = 0;
        for (int i = 2; i <= 10; i++) {
            int d = temp % 10;
            sum += i * d;
            temp /= 10;
        }        
        if (sum % 11 == 0) isbn += "0";
        else if ( sum % 11 == 1) isbn += "X";
        else isbn += (11 - sum % 11);
        
        System.out.println("ISBN: " + isbn);
    }
}

