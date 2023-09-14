// Tara and Candies
// Time Limit: 2, Memory Limit: 256000
// Tara loves candies. She has got X Rs. in her pocket, she wants to get as many chocolates as possible. Each candy costs 1 Rs, and Tara also has a unique advantage – for every 3 candy wrappers she collects, she can exchange them for an extra candy. Your task is to help Tara determine the total number of candies she can get with the given X Rs.
// Input
// The input consists of a single integer X, representing the amount of money Tara has.
// Constraints
// 1 <= X <= 109
// Output
// Print an integer, the total number of candies Tara can have.
// Example
// Input:
// 5

// Output: A
// 7

// Explanation:
// With 5 Rs. Tara can buy 5 candies. Now she has 5 wrappers, with 3 wrappers (2 remaining) she get one more candy. Total candies so far = 6(5+1) and the wrappers 2 (Remained out of 5) + 1 (That of new candy) = 3. So, she gets one more.
// Hence the total number of candies = 7.
import java.util.*;
public class Tara_and_Candies {
    public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);
       int x = scanner.nextInt();
       int candies = x;
       int wrappers = candies;
       while (wrappers >= 3) {
           int extraCandies = wrappers / 3;
           candies += extraCandies;
           wrappers = wrappers % 3 + extraCandies;
       }
       System.out.println(candies);
       scanner.close();
   }
}
