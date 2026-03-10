public class PalindromeCheckerApp {

    /**
     * Recursive method to check palindrome
     */
    public static boolean isPalindrome(String input, int start, int end) {

        // Base condition: if pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        // Recursive call moving towards center
        return isPalindrome(input, start + 1, end - 1);
    }

    /**
     * Application entry point
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "madam";

        // Call recursive palindrome check
        boolean result = isPalindrome(input, 0, input.length() - 1);

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}