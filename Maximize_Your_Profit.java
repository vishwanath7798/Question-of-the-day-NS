// Maximize Your Profit
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// As a crop dealer, you have anticipated the market rates of a specific crop for the upcoming days. You have noted down these predictions in an array named prices, where prices[i] represents the expected rate of the crop on the ith day.

// Your goal is to determine the best day to purchase the crop and a subsequent day to sell it in order to maximize your profit.

// Find out the maximum profit you can achieve from this trading strategy. If no profit can be made, return 0.
// Input
// Input:
// Input consists of 2 lines:
// First line contains an integer n: The number of days.
// Second line contains n numbers, each representing the price of crop at a particular day.

// Constraints
// 1 <= n <= 105
// 1 <= prices[i] <= 106, (1 <= i <= n)
// Output
// Print an integer, representing the maximum profit achievable.
// Example
// Input
// 5
// 1 2 3 4 5

// Output
// 4

// Explanation:
// You buy the crop on day 1 at 1 amount, ans sell it on day 5 at 5 amount.
// So, Profit = 4 unit.
import java.util.Scanner;
public class Maximize_Your_Profit {
    public static int findMaxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        int maxProfit = findMaxProfit(prices);
        System.out.println(maxProfit);
    }
}
