// Divisibility Transformation
// Time Limit: 2, Memory Limit: 256000
// You are given an array A of size N. In one move, you can choose any index i and either decrease or increase the element on that index by 1. Find the minimum number of moves required to make all elements in the array divisible by K.
// Input
// The first line of the input contains two integers N and K.
// The second line of the input contains N space seperated integers.

// Constraints:
// 1 <= N <= 105
// 1 <= Ai <= 109
// 1 <= K <=109
// Output
// Print the minimum number of moves required to make all elements in the array divisible by K.
// Example
// Sample Input:
// 6 3
// 7 3 4 8 5 1

// Sample Output:
// 5
import java.util.*;
public class Divisibility_Transformation {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int current;
        long minMoves = 0;
        for(int i = 0; i < N; i++)
        {
            current = sc.nextInt();
            int remainder = current % K;
            if(remainder <= K/2)
                minMoves += remainder;
            else
                minMoves += K - remainder;
        }
        sc.close();
        System.out.println(minMoves);
    }
}
