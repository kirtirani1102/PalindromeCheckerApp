public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "Never Odd Or Even";

        // Normalize the string
        // 1. Convert to lowercase
        // 2. Remove spaces
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Two-pointer comparison
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display results
        System.out.println("Original Input : " + input);
        System.out.println("Normalized Input : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}