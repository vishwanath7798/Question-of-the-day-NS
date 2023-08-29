// Patients in the hospital
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Bob owns a hospital and In that hospital, a total n number of patients have booked the time slots for their check-up. Bob doesn’t want any patient to wait for their turn due to the unavailability of doctors. Bob asks you to determine the number of doctors needed such that no patient needs to wait for check-up.

// Time slots are given in form of two arrays:
// Arrival time array (A) : Time when the patient arrives
// Departure time array (B) : Time when the patients leaves after check-up.
// Input
// The first line of the input contains a single integer n, representing the number of patients.
// The second line of the input contains n space separated integers where the ith number represents the arrival time of the ith patient.
// The third line of the input contains n space separated integers where the ith number represents the leaving time of the ith patient.

// Constraints:
// 1 ≤ n ≤ 105
// 0 ≤ A[i] ≤ B[i] ≤ 2359
// Output
// Print an integer representing the minimum number of doctors required in the hospital.
// Example
// Input:
// 3
// 1000 1300 1100
// 1150 1420 1150

// Output:
// 2

// Explanation:
// First patient comes at 1000 and leaves at 1150 but the Third patient comes at 1100 (And the first patient is still in check-up), so minimum requirement is of 2 doctors so far. While the second patients comes when the patient 1 and 2 have gone.
// Hence the total doctors required are 2.
import java.util.*;
class Patients_in_the_hospital {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int time[] = new int[2400];
        int n = sc.nextInt();
        int entry[] = new int[n];
        for(int i=0;i<n;i++){
            entry[i] = sc.nextInt();
        }
        int exit[] = new int[n];
        for(int i=0;i<n;i++){
            exit[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=entry[i];j<=exit[i];j++)
                time[j] += 1;
        }
        int max = 0;
        for(int i=0;i<2400;i++){
            max = Math.max(max,time[i]);
        }
        System.out.println(max);
        sc.close();
    }
}