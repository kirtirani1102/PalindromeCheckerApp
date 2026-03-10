/**
 * UC12: Strategy Pattern for Palindrome Algorithms
 * Demonstrates selecting different palindrome strategies at runtime.
 */

import java.util.*;

interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {
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
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        // Choose strategy dynamically
        PalindromeStrategy strategy;

        // Change strategy here
        strategy = new StackStrategy();
        // strategy = new DequeStrategy();

        boolean result = strategy.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Using Strategy : " + strategy.getClass().getSimpleName());
        System.out.println("Is Palindrome? : " + result);
    }
}