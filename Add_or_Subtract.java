// Add or Subtract
// Time Limit: 2, Memory Limit: 256000
// You are given two numbers X and Y.

// If X is a divisor of Y, then print X + Y or else print Y - X.
// Input
// The first line of the input contains 2 integers X and Y.

// Constraints:
// 1 ≤ X ≤ Y ≤ 100
// Output
// Print the answer
// Example
// Sample Input 1:
// 10 20

// Sample Output 1:
// 30


// Sample Input 2:
// 4 5

// Sample Output 2:
// 1
import java.util.Scanner;
public class Add_or_Subtract {
     public static void main (String[] args) {
        // Your code here
          Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
       System.out.println ((Y % X == 0) ? X + Y : Y - X);
       sc.close();
    }
}
