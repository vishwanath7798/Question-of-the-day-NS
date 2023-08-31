// Maximum adjacent product II
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given an array of integers, you have the freedom to rearrange its elements as you wish. Your goal is to determine the maximum product achievable from a pair of adjacent numbers in the modified array.
// Input
// The first line of the input contains a single integer n, representing the length of array.
// The second line of the input contains n space separated integers, representing the elements of array

// Constraints
// 2 ≤ n ≤ 105
// -1000 ≤ A[i] ≤ 1000
// Output
// Print an integer representing the maximum product of adjacent pair of numbers in the array.
// Example
// Input:
// 4
// 3 5 4 7

// Output
// 35

// Explanation
// We can rearrange the array as following :
// [3, 4, 5, 7]
// The products of adjacent numbers are:
// [3*4, 4*5, 5*7], which is
// [12, 20, 35]

// Hence, the maximum product is 35.
import java.util.*;
public class Maximum_adjacent_product_II {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int max_product_1 = arr[n-1] * arr[n-2];
        int max_product_2 = arr[0] * arr[1];
        int max_adjacent_product = Math.max(max_product_1, max_product_2);
        System.out.println(max_adjacent_product);
        scanner.close();
    }
}
