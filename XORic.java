// XORic
// Time Limit: 2, Memory Limit: 256000
// You are given an array arr of size n and an integer K. Additionally, you have q queries, each in the form of [l, r]. For each query, you are required to perform a bitwise XOR operation on each element within the range [l, r] with a given value K.

// Your task is to calculate and print the sum of all elements in the final array after performing all the specified queries.
// Input
// The input consists of three lines:

// The first line contains two integers-
// n : the size of the array,
// K : The number we've to XOR the array with.

// The second line contains n integers separated by spaces, representing the initial array.
// The third line contains an integer q, the number of queries.
// The next q lines contain two space- separated integers l and r, representing a query.

// Constraints
// 1 <= n <= 105
// 0 <= K <= 109
// 1 <= q <= 103
// 1 <= l <= r <= n
// Output
// Print an integer, the sum of all elements in the final array after applying all the queries.
// Example
// Input:
// 5 2
// 1 2 3 4 5
// 3
// 2 4
// 1 3
// 4 5

// Output:
// 19

// Explanation
// There are 3 queries:
// query[1] = [2, 4]: After performing XOR in the range the array looks like: [1, 0, 1, 6, 5]
// query[2] = [1, 3]: After performing XOR in the range the array looks like: [3, 2, 3, 6, 5]
// query[3] = [4, 5]: After performing XOR in the range the array looks like: [3, 2, 3, 4, 7]

// Now the sum of all elements of the array is: (3 + 2 + 3 + 4 + 7) = 19.
import java.util.Scanner;
public class XORic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the input
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int q = scanner.nextInt();
        int[][] queries = new int[q][2];
        for (int i = 0; i < q; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            
            for (int j = l - 1; j < r; j++) {
                arr[j] ^= k;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        scanner.close();
    }
}
