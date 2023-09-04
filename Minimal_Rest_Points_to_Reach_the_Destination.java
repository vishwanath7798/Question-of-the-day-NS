// Minimal Rest Points to Reach the Destination
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are on a journey to reach a faraway destination. There are n rest points on the way. If you rest at a point, you get enough energy to skip more rest points than your last rest, starting from being able to skip just 1. For instance, if you rest at the first point, you can then skip one more checkpoint. If you decide to rest again afterwards, you can then skip two checkpoints, and so on.

// Your task is to determine the minimum number of rest points you need to stop at in order to reach the destination.
// Input
// Input:
// Input consists of an integer n: the number of rest points.

// Constraints
// 1 <= n <= 109
// Output
// Print an integer representing the minimum number of stops needed to reach destination.
// Example
// Input
// 5

// Output
// 2

// Explanation:
// Rest points: _ _ _ _ _

// Rest points, you'll stop at: 1 _ 1 _ _

// When you rest at stop 1, you can skip 1 rest point.
// Now, when you stop at stop 3, you can skip 2 more rest points, reaching your destination.
import java.util.*;
public class Minimal_Rest_Points_to_Reach_the_Destination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int stops = 0;
        int energy = 1;
        int position = 1;
        while (position < n) {
            position += energy;
            energy += 1;
            stops += 1;
        }
        System.out.println(stops);
        scanner.close();
    }
}
