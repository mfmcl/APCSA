package assignments.src.Mar10;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("americaN"));
    }

    public static String reverse(String s) {
        if (s.isEmpty())
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
