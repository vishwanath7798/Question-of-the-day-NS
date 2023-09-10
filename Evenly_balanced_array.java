// Evenly balanced array
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given an array of n integers, your quest is to find the sum of those integers that have the number of even divisors not less than that of the odd divisors.
// Input
// The first line contains an integer n, representing the length of the array.
// The second line contains n integers separated by spaces, representing the elements of the array.

// Constraints
// 1 <= n <= 103
// 1 <= arr[i] <= 105, 1 <= i <= n.
// Output
// Print an integer representing the sum of numbers having more even divisors than odd.
// Example
// Input:
// 3
// 1 2 3

// Output:
// 2

// Explanation
// The divisors of 1: 1
// The divisors of 2: 1 2
// The divisors of 3: 1 3

// In the above numbers, only the number of even divisors of 2 are more than or equal to that of odd divisors. Hence the output is 2.
import java.util.*;
public class Evenly_balanced_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            int evenDivisors = 0;
            int oddDivisors = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    if (j % 2 == 0) {
                        evenDivisors++;
                    } else {
                        oddDivisors++;
                    }
                }
            }
            if (evenDivisors >= oddDivisors) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
