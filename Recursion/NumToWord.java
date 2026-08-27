//you are given a number (e.g., 2019). Convert it into a string of English words like "two zero one nine". 
// Use a recursive function to solve this problem.
//Note: The digits of the number will only be in the range 0-9; the last digit of a number can't be 0.
// Sample Input: 1947 Sample Output: "one nine four seven"

package Recursion;
import java.util.*;
public class NumToWord {

    static String[] words = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    };

    static void printWords(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        // Process remaining digits first
        printWords(n / 10);

        // Get last digit and print its word
        int digit = n % 10;
        System.out.print(words[digit] + " ");
    }

    public static void main(String[] args) {
        int n = 1947;

        printWords(n);
    }
}
