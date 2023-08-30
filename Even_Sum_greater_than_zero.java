// Even Sum greater than zero
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given an array arr of length n. In one operation, you can choose any index i and either increment arr[i] by 1 or decrement arr[i] by 1. Your goal is to find the minimum number of operations required to ensure that the sum of all elements in the array is even but not zero, i. e., the sum should be divisible by 2 and greater than 0.
// Input
// The first line contains an integer n, the length of the array.
// The second line contains n integers separated by spaces, representing the elements of the array.

// Constraints
// 1 <= n <= 105
// 0 <= arr[i] <= 106, 0<=i<=n-1.
// Output
// Print an integer, the minimum number of operations required to ensure an even sum greater than of all elements in the array.
// Example
// Input:
// 4
// 5 7 3 2

// Output
// 1

// Explanation:
// Choose index i=0, a[i]=5 and
// Increment it. This will result into sum = (6+7+3+2) = 18 (Even)
// OR
// Decrement it, This will result into sum = (4+7+3+2) = 16 (Even)

// Similarly, we can choose any of the number from the array and operate on it. And in 1 operation we can meet the requirements. Hence, the answer is 1.
import java.util.*;
public class Even_Sum_greater_than_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = 0;
        int sum = 0;
        int minAbs = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            current = sc.nextInt();
            sum += current;
            minAbs = Math.min(minAbs,Math.abs(current));
        }
        if(sum % 2 == 0 && sum > 0)
            System.out.println(0);
        else if(sum % 2 == 1)
            System.out.println(1);
        else
            System.out.println(2);
        sc.close();
    }
}
