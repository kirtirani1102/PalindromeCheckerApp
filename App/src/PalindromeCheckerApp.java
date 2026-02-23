/**
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing it using a loop.
 *
 * UC3: Palindrome Check Using String Reverse
 *
 * @author Developer
 * @version 3.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded input string
        String input = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Iterate from last character to first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        boolean isPalindrome = input.equals(reversed);

        // Display result
        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}