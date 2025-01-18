package src.collections;

public class Palindrome {
    public static boolean Palindromecheck(String s) {
        s = s.replaceAll("\\s", "");

        int n = s.length();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "manam";
        if (Palindromecheck(word)) {
            System.out.println("\"" + word + "\" is a palindrome.");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
    }
}
