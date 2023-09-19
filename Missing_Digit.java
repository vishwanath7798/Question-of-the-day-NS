// Missing Digit
// Time Limit: 2, Memory Limit: 256000
// You are given a string S of length exactly 9, containing digits. All digits appear exactly once in S. You need to find and print the digit which is missing.
// Print the only digit missing in S.
// Input
// The input consists of a string.
// S

// Constraints
// S is a string of length 9 consisting of digits.
// All characters in S are distinct.
// Output
// Print the only digit missing in
// S.
// Example
// Sample Input 1
// 023456789
// Sample Output 1
// 1

// Sample Input 2
// 459230781
// Sample Output 2
// 6
import java.util.*;
class Missing_Digit {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=Integer.parseInt(s.charAt(i)+"");
        }
          System.out.println(45-sum);
       sc.close();
    }
}