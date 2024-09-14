package TTMATH;
//import
import java.util.*;
import java.io.*;


public class coinChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] coins = new int[n];
        for(int i = 0; i < n; i++) {
            coins[i] = in.nextInt();
        }
        int target = in.nextInt();
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int i = 0; i < n; i++) {
            for(int j = coins[i]; j <= target; j++) {
                dp[j] += dp[j-coins[i]];
            }
        }
        System.out.println(dp[target]);
        in.close();
        
    }
    
}
