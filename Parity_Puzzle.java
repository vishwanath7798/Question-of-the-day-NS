// Parity Puzzle
// Time Limit: 2, Memory Limit: 256000
// You are given an array of integers. Your task is to determine whether it's possible to divide the array into two non- empty sets such that the sum of each set has the same parity.
// Input
// The input consists of two lines:

// The first line contains an integer n, the size of array.
// The second line contains n integers, the elements of array.

// Constraints
// 1 <= n <= 105
// 1 <= array[i] <= 106
// Output
// Print "Yes" if it's possible to divide the array into two sets with the same parity sum, and "No" otherwise.
// Example
// Input
// 8
// 1 2 4 3 2 3 5 4

// Output
// Yes

// Explanation
// Put (1, 3, 3, 5) in one part and (2, 4, 2, 4) in other part. Thus both the parts have an even sum.
import java.util.*;
public class Parity_Puzzle {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            sum += arr[i];
        }
        if(sum%2==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
