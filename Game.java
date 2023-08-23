import java.util.*;
public class Game {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n :");
        int n = sc.nextInt();
        System.out.println("enter the value of m :");
        int m = sc.nextInt();
        String currentPlayer = "Ram";
        sc.close();
        while (true) {
            if (currentPlayer.equals("Ram")) {
                if (n > 0) {
                    n--;
                } else {
                    System.out.println("Ram");
                    break;
                }
                currentPlayer = "Shyam";
            } else if (currentPlayer.equals("Shyam")) {
                if (m > 0) {
                    m--;
                } else {
                    System.out.println("Shyam");
                    break;
                }
                currentPlayer = "Rahul";
            } else if (currentPlayer.equals("Rahul")) {
                if (n > 0 && m > 0) {
                    n--;
                    m--;
                } else {
                    System.out.println("Rahul");
                    break;
                }
                currentPlayer = "Ram";
            }
        }
    }
}

// Game of Numbers
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Ram, Shyam, and Rahul are friends who are looking to have some fun during their vacation. They decide to play a game involving odd and even integers. There are n even integers and m odd integers. Ram can only choose even integers, Shyam can choose only odd integers, and Rahul, being the youngest, chooses two numbers: one from the even integers and one from the odd integers.

// The game is played in turns, starting with Ram, followed by Shyam, and finally Rahul. Each player selects their required number based on their restrictions. The player who is left with no valid option loses the game.
// Input
// The first line contains an integer n representing the number of even integers.
// The second line contains an integer m representing the number of odd integers.

// Constraints
// 1 <= n <= 10^9
// 1 <= m <= 10^9
// Output
// Print a string, the name of the player who loses the game (Ram, Shyam, or Rahul).
// Example
// Input
// n = 4
// m = 4

// Output
// Ram

// Explanation
// Ram chose one from even integers: (n, m) = (3, 4)
// Shyam chose one from odd integers: (n, m) = (3, 3)
// Rahul chose one from each group: (n, m) = (2, 2)
// Ram chose one from even integers: (n, m) = (1, 2)
// Shyam chose one from even integers: (n, m) = (1, 1)
// Rahul chose one from each group: (n, m) = (0, 0)
// Now, It's Ram's turn and there are no even integers. So, Ram lost the game.