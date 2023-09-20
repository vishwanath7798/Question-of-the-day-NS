import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Even_Pair {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 2 == 1) {
                odd.add(a);
            } else {
                even.add(a);
            }
        }
        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even, Collections.reverseOrder());
        int mx = -1;
        if (odd.size() >= 2) {
            mx = Math.max(mx, odd.get(0) + odd.get(1));
        }
        if (even.size() >= 2) {
            mx = Math.max(mx, even.get(0) + even.get(1));
        }
        System.out.println(mx);
        sc.close();
    }
}
