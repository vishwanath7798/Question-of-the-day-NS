import java.util.Scanner;

public class Maximum_Integer_Gift {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int max_integer = Math.max(Math.max(X + Y, X - Y), X * Y);
        System.out.println(max_integer);
        sc.close();
    }
}
