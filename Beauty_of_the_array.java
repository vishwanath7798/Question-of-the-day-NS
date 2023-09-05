// Beauty of the array
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You're given an array of size n. You can rearrange the array to form a beautiful array. Find the maximum length of the subarray that is a beautiful after rearrangment.

// A beautiful array is an array in which even and odd numbers are adjacent.
// (i. e. [ 1, 2, 3, 4, 5] is a beautiful array of size 5,
// [2, 3, 4, 5, 6] is also a beautiful array of size 5,
// But, [1, 7, 2, 3 ] is not a beautiful array as 1 and 7 (both odd) are adjacent, similarly
// [2, 4, 3, 6] is not a not a beautiful array as 2 and 4 (both even) are adjacent. )
// Input
// The input consists of two lines:

// The first line contains an integer n, the size of array.
// The second line contains n integers, the array elements

// Constraints
// 1 <= n <= 106
// 1 <= array[i] <= 109
// Output
// Print the maximum length of a subarray that is beautiful.
// Example
// Input
// 6
// 1 8 5 4 2 8 6 6 7 6

// Output
// 6

// Explanation
// We can rearrange the array as [ 1, 8, 5, 4, 7, 2, 6, 6, 6], In this array, subarray [1, 8, 5, 4, 7, 2] is beautiful and
// Hence, the maximum length of beautiful subarray is 6.
import java.util.*;
class Beauty_of_the_array {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0, odd = 0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a%2==0)
                even++;
            else
                odd++;
        }
        if(even==odd)
            System.out.println(n);
        else
            System.out.println(2*Math.min(even,odd)+1);
            sc.close();
    }
}