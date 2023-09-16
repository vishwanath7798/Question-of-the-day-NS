// Most Craved Dish
// Time Limit: 2, Memory Limit: 256000
// In a bustling restaurant known for its delectable offerings, each dish is tagged with a unique integer ID. The restaurant management is curious to find out the most craved dish among its customers. They've collected feedback from n customers, each providing their favorite dish's ID in the form of an array.

// Your task is to determine the dish ID that is the favorite of the maximum number of people. (It's guaranteed that there is only one most craved dish)
// Input
// The input consists of two lines:

// The first line contains an integer n, the number of customers.
// The second line contains n integers separated by spaces, representing the favorite dish IDs of the customers.

// Constraints
// 1 <= n <= 105
// 1 <= ID[i] <= 106, 1 <= i <= n
// Output
// Print an integer, the Dish Id that is favorite of the maximum number of people.
// Example
// Input
// 10
// 1 2 1 2 3 2 3 2 4 2

// Output
// 2

// Explanation
// Dish with Id 2, appears 5 times, which is maximum.
// Hence the most craved dish is 2.
import java.util.*;
public class Most_Craved_Dish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] favoriteDishIds = new int[n];
        for (int i = 0; i < n; i++) {
            favoriteDishIds[i] = scanner.nextInt();
        }
        Map<Integer, Integer> dishCount = new HashMap<>();
        for (int dishId : favoriteDishIds) {
            dishCount.put(dishId, dishCount.getOrDefault(dishId, 0) + 1);
        }
        int mostCravedDishId = Collections.max(dishCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(mostCravedDishId);
        scanner.close();
    }
}
