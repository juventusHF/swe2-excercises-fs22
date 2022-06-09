package ch.juventus.recursion;

import java.util.List;

public class PalindromeExercise {

    public static void main(String[] args) {

        List<String> inputs = List.of("Anna", "Korb", "Bob",
                "Mein Computer", "Level", "Fuss", "Anna Bob Anna",
                "Kamel und Stein", "!+Level+!");

        for (String input : inputs) {
            boolean isPalindrome = isPalindrome(input);
            System.out.println(input + " - " + isPalindrome);
        }

    }

    private static boolean isPalindrome(String input) {
        int textLength = input.length();

        if (textLength <=1) {
            return true;
        }

        String firstLetter = input.substring(0, 1);
        String lastLetter = input.substring(textLength-1, textLength);

        if (!firstLetter.equalsIgnoreCase(lastLetter)) {
            return false;
        }

        return isPalindrome(input.substring(1, textLength-1));
    }

}
