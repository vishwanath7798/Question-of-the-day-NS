import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Bags_Required {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int totalWeight=sc.nextInt();
        int wt[]=new int[n];
        int capacity=0;
        for (int i=0; i<n; i++){
            wt[i]=sc.nextInt();
            capacity += wt[i];
        }
        sc.close();
        if(capacity<totalWeight){
            System.out.println(-1);
        }else{
            Arrays.sort(wt);
            int minBags=0;
            capacity=0;
            for(int i=n-1; i>=0; i--){
                capacity += wt[i];
                minBags++;
                if(capacity>=totalWeight){
                    System.out.println(minBags);
                    return;
                }
            }
        }
    }
}
