// Backtracking Bishnoi
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Bishnoi is fascinated by permutations and sequences. He wants to find all permutations of size N such that each element in the permutation is between 1 and N (inclusive).
// The catch is that for any permutation P, P[i] should not be at the ith position. Write a program to find the total number of all such permutations.
// Input
// Input contains a single integer N (2 ≤ N ≤ 10) representing the size of the permutations.
// Output
// Print an integer representing the total number of permutations satisfying the above conditions.
// Example
// Sample Input
// 3

// Sample Output
// 2

// Explanation
// In the above example, the permutations [1, 2, 3] and [2, 1, 3] are not valid because at least one element appears at its original index. The valid permutations are [2, 3, 1] and [3, 1, 2]. Hence, the output is 2.
import java.util.*;
public class Backtracking_Bishnoi {
    public static int back(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return (n-1)*(back(n-1)+back(n-2));
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=back(n);
        System.out.println(result);
        sc.close();
    }
}
