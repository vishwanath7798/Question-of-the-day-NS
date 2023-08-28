// Total gift pairs
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// In a gift store, you have won a coupon with a coupon number. This coupon can be used to purchase pairs of gifts, and it provides a discount on pairs of gifts whose sum is a multiple of the coupon number. You are given a list of n gifts with their respective costs. Your task is to find the total number of pairs of gifts that you can purchase using the coupon to get a discount.
// Input
// The first line contains an integer n representing the size of gifts list.
// The second line contains a list of n positive integers representing the cost of each gift
// The third line contains a single integer representing the coupon number.


// Constraints
// 1 <= n <= 106
// 1 ≤ gifts[i] ≤ 105
// 1 ≤ coupon_number ≤ 105
// Output
// Print an integer representing the total number of pairs of gifts that can be purchased using the coupon to get a discount.
// Example
// Input:
// 5
// 5 7 9 10 15
// 5


// Output:
// 3

// Explanation:
// In the example, the pairs of gifts with sums divisible by 5 are:
// (5, 10)
// (5, 15)
// (10, 15)

// So, the total number of such pairs is 3.
import java.util.*;
public class Total_gift_pairs {
    public static int findGiftPairs(int[] gifts, int couponNumber) {
        Map<Integer, Integer> remainderCount = new HashMap<>();
        int count = 0;

        for (int gift : gifts) {
            int remainder = gift % couponNumber;
            int complement = (couponNumber - remainder) % couponNumber;

            if (remainderCount.containsKey(complement)) {
                count += remainderCount.get(complement);
            }

            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int gifts[]=new int[n];
        for(int i=0; i<n; i++){
            gifts[i]=sc.nextInt();
        }
        int couponNumber=sc.nextInt();
        int count = findGiftPairs(gifts, couponNumber);
        System.out.println(count);
        sc.close();
    }
}
