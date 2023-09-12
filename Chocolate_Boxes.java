// Chocolate Boxes
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// There are n chocolates of various sizes and shapes, each carrying its own weight and delight. You are given an array of n integers that represents the weights of chocolates. You want to distribute chocolates among a collection of exquisite boxes, which can hold maximum W amount of weight only. However, there's a rule – each box can hold at most two chocolates, provided their combined weight doesn't exceed the limit(W).

// You want to efficiently distribute the chocolates. Find the total boxes needed to distribute all n chocolates.
// Input
// The input consists of two lines:
// The first line contains two integers- n: the number of chocolates in the collection, W: The weight limit of boxes.
// The second line contains n integers separated by spaces, representing the weights of the chocolates.

// Constraints
// 1 <= n <= 103
// 1 <= W <= 109
// 1 <= wt[i] <= 105
// Output
// Print an integer, the minimum number of boxes required to carry all the chocolates while adhering to the weight limit.
// Example
// Input:
// 4 3
// 2 3 2 1
// Output:
// 3

// Explanation:
// In the first chocolate box place chocolates with (2, 1)
// In the second box place chocolates with (2)
// And in the third box place chocolates with (3).
// Thus we need 3 boxes.
import java.util.*;
public class Chocolate_Boxes {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0,j=n-1,ans=0;
        while(i<=j){
            if(arr[i]+arr[j]<=w)
                i++;
                j--;
                ans++;
        }
        System.out.println(ans);
        sc.close();
    }
}
