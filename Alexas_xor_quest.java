import java.util.*;
public class Alexas_xor_quest{
    public static long calculateXOR(long n) {
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A, B;
        A = sc.nextLong();
        B = sc.nextLong();
        long xorResult = calculateXOR(A - 1) ^ calculateXOR(B);
        System.out.println(xorResult);
        sc.close();
    }
}