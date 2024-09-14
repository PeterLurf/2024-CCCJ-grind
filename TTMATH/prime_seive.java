package TTMATH;
import java.util.*;
import java.io.*;
import java.math.*;
@SuppressWarnings("unused")

public class prime_seive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long start = System.currentTimeMillis();
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= Math.sqrt(n)+1; i++) {
            if (isPrime[i]) {
                for (int j = i*2; j <= n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (isPrime[i]) {
                
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);
        System.out.println("\n" + count);
        sc.close();
    }
    
}
