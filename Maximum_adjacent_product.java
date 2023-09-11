// Maximum adjacent product
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given an array(A) of integers. Your task is to find the maximum product that can be obtained from a pair of adjacent numbers in the array.

// Return the maximum product of adjacent pair of numbers.
// Input
// First line contain length of array
// An array of integers n (2 ≤ n ≤ 105)
// Each element of the array is an integer in the range [-1000, 1000].
// Output
// An integer representing the maximum product of adjacent pair of numbers in the array.
// Example
// Input:
// 4
// 3 5 7 4

// Output
// 35

// Explanation
// The products of adjacent numbers are:
// [3*5, 5*7, 7*4]
// [15, 35, 28]

// Hence, the maximum product is 35.
import java.util.*;
public class Maximum_adjacent_product {
    public static int findMaxAdjacentProduct(int[] arr) {
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int product = arr[i] * arr[i + 1];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }
        return maxProduct;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findMaxAdjacentProduct(arr));
        sc.close();
    }
}
