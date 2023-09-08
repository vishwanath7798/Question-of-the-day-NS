// Maximum holes in a path
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// In a land of binary paths, adventurers traverse roads made up of two types of terrain: clean roads represented by 1 and treacherous holes represented by 0. To determine the path's danger levels, your task is to find the maximum number of consecutive holes in the path.
// Input
// The input consists of two lines:

// The first line contains an integer n, the size of array.
// The second line contains n integers, the type of the path (either '0' or '1').

// Constraints
// 1 <= n <= 106
// Output
// Print an integer representing the maximum number of consecutive holes in the path.
// Example
// Input
// 5
// 1 0 0 1 0

// Output
// 2

// Explanation
// There are maximum 2 consecutive holes. So the output is 2.
import java.util.*;
public class Maximum_holes_in_a_path {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            int path = sc.nextInt();
            if(path==1)
                count = 0;
            else
                count++;
            max = Math.max(max,count);
        }
        System.out.println(max);
        sc.close();
    }
}
