/**
 * Description:
 * This class checks whether a hardcoded string is a palindrome.
 *
 * UC2: Print a Hardcoded Palindrome Result
 *
 * @author Developer
 * @version 2.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        // Assume it is a palindrome initially
        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {

            // Compare characters from start and end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop early if mismatch found
            }
        }

        // Print result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}