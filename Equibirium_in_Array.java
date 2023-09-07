// Equibirium in Array
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You're given a binary array (1 based indexing) containing 0's and 1's. Your task is to determine whether an index K exists such that the sum of the elements till index K is same as that of the elements after K.
// (i. e. a[1] + a[2] +. . a[k] = a[k+1] + a[k+2] +. . a[n] and 1 <= K <= n-1).

// Print "Yes" if such K exists, "No" otherwise.
// Input
// The input consists of two lines:

// The first line contains an integer n, the size of array.
// The second line contains n integers (either '0' or '1').

// Constraints
// 1 <= n <= 106
// Output
// Print "Yes" if K exists, "No" otherwise.
// Example
// Input
// 5
// 1 0 0 1 0

// Output
// Yes

// Explanation
// You can choose any of the indices among (1, 2, 3 ). Selecting any, would satisfy the condition.
import java.util.*;
public class Equibirium_in_Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            if(sc.nextInt()==1)
                count++;
        }
        if(count%2==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}