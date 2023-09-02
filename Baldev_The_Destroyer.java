// Baldev: The Destroyer
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Baldev, known as the destroyer, possesses immense strength and is on a mission to raze buildings to the ground. The cityscape is filled with n buildings, each with its own strength represented by st[i], (1<= i <= n).

// Baldev's initial strength is K, and with each building he destroys, his power increases by the strength of that building. Your task is to help Baldev determine the maximum number of buildings he can destroy while considering his initial strength and the strength of each building.
// Input
// The first line of the input contains two space separated integers n and K, representing the number of buildings in the city and Baldev's initial strength.
// The second line contains n integers separated by spaces, where the ith integer represents the strength of the ith building.

// Constraints
// 1 <= n <= 105
// 0 <= K <= 106
// 0 <= st[i] <= 106
// Output
// Print an integer, the maximum number of buildings Baldev can destroy while considering his initial strength and the building strengths.
// Example
// Input:
// 3 1
// 2 1 5

// Output:
// 2

// Explanation:
// Baldev's initial strength is 1.
// He destroys the building with strength 1 and now his strength becomes 2(1+1).
// Now, he demolishes the building with strength 2 and his strength is 4(2+2).
// He cannot destroy the building with strength 5.
// Hence the output is 2.
import java.util.*;
public class Baldev_The_Destroyer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int K = scanner.nextInt();
        int[] st = new int[n];
        for (int i = 0; i < n; i++) {
            st[i] = scanner.nextInt();
        }
        Arrays.sort(st);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (K >= st[i]) {
                K += st[i];
                count += 1;
            } else {
                break;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
