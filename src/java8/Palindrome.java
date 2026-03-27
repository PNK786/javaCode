package src.java8;

import java.util.stream.IntStream;

public class Palindrome
{
    public static void main(String[] args) {
        String str= "next";

        boolean result = IntStream.range(0, str.length() / 2)
                                       .allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));
        System.out.println(result);
    }
}
