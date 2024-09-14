
package TTMATH;
import java.util.*;
import java.io.*;
@SuppressWarnings("unused")

/**
 * segmented_prime_seive
 */
public class segmented_prime_seive {

    public static void main(String[] args) {
        //segmented seive count primes from long a to b
        Scanner in = new Scanner(System.in);
        
        long a = in.nextLong();
        long b = in.nextLong();
        long n = b - a + 1;
        boolean[] isPrime = new boolean[(int)n];
        Arrays.fill(isPrime, true);
        for (long i = 2; i * i <= b; i++) {
            for (long j = Math.max(i * i, (a + i - 1) / i * i); j <= b; j += i) {
                isPrime[(int)(j - a)] = false;
            }
        }
        for (int i = 0; i < n; i++) {
            if (isPrime[i]) {
                System.out.println(i + a);
                
            }
        }


    }
}