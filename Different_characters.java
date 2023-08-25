// Different characters
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given two strings a and b. Your task is to find the number of indices where string a differs from string b. (Note: Strings are case insensitive i. e. Hello is same as hELLo).
// Input
// The input consists of two lines:

// The first line contains string a (1 <= |a| <= 10^4), representing the first string.
// The second line contains string b (|b| = |a|), representing the second string.
// Output
// Print an integer, the count of places where the two strings differ.
// Example
// Input
// a = "NewtonSchool"
// b = "newrOnTshool"

// Output
// 3

// Explanation
// The strings differ at index 3, 6 and 7. Hence the output is 3.
import java.util.*;
public class Different_characters{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int diff = 0, count = 0;
        for(int i=0;i<a.length();i++){
            diff = (int)Math.abs(a.charAt(i)-b.charAt(i));
            if(diff!=0 && diff!=32)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}