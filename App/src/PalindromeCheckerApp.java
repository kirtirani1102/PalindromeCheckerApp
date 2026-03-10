/**
 * UC13: Performance Comparison of Palindrome Algorithms
 * Compares execution time of different palindrome checking methods
 */

import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Two-pointer approach
    public static boolean checkUsingTwoPointer(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Reverse string approach
    public static boolean checkUsingReverse(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }

    // Method 3: Stack approach
    public static boolean checkUsingStack(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "level";

        // Two Pointer Timing
        long start1 = System.nanoTime();
        boolean result1 = checkUsingTwoPointer(input);
        long end1 = System.nanoTime();

        // Reverse Timing
        long start2 = System.nanoTime();
        boolean result2 = checkUsingReverse(input);
        long end2 = System.nanoTime();

        // Stack Timing
        long start3 = System.nanoTime();
        boolean result3 = checkUsingStack(input);
        long end3 = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println();

        System.out.println("Two Pointer Result : " + result1);
        System.out.println("Execution Time : " + (end1 - start1) + " ns");

        System.out.println();

        System.out.println("Reverse String Result : " + result2);
        System.out.println("Execution Time : " + (end2 - start2) + " ns");

        System.out.println();

        System.out.println("Stack Result : " + result3);
        System.out.println("Execution Time : " + (end3 - start3) + " ns");
    }
}