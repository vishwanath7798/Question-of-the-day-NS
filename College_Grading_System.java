import java.util.Scanner;
public class College_Grading_System {
     public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double cgp=0;
        double d=0;
        for(int i=0;i<n;i++){
            d=0;
            for(int j=0;j<4;j++){
                d+=sc.nextDouble();

            }
            cgp+=(d/4);
        }
        cgp=cgp/n;

        if(cgp>=8.5){
            System.out.println("A");
        }
        else if(cgp>=7.0 && cgp<8.5){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
        sc.close();
    }
}


// College Grading System
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// The college is preparing for its annual grading of students who have completed a 4- year course. Each student's GPA is calculated as the average of their four- year YGPAs (Yearly Grade Point Averages). The college grading is based on the average GPA of all(n) students.

// You are tasked with creating a program that calculates the college's grade based on the following criteria:

// If the average GPA is greater than or equal to 8.5, the grade is 'A'.
// If the average GPA is between 7.0(inclusive) and 8.5 , the grade is 'B'.
// Otherwise, the grade is 'C'.

// You've to print the grade of the college('A', 'B' or 'C').
// Input
// The first line contains an integer n (1 <= n <= 10^5), the number of students.
// The next n lines contain four space- separated decimal numbers (1 <= YGPA <= 10), representing the YGPAs of each student over four years.
// Output
// Print the college's grade ('A', 'B', or 'C') based on the average GPA of all students.
// Example
// Input:
// 5
// 8.7 9.1 8.3 8.9
// 7.2 7.5 7.8 7.0
// 8.0 7.8 8.2 8.4
// 6.5 6.7 6.9 6.3
// 9.0 9.2 9.1 9.3

// Output
// B

// Explanation
// The average GPAs for each student are [8.75, 7.375, 8.1, 6.6, 9.15].
// The average GPA of all students is (8.75 + 7.375 + 8.1 + 6.6 + 9.15) / 5 = 7.995.
// Since the average GPA is < 8.5 && >=7.0, the college's grade is 'B'.