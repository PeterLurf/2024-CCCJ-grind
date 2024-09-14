package randomDmoj;

import java.util.*;
import java.io.*;
import java.math.BigInteger;
@SuppressWarnings("unused")

public class fast_fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            System.out.println(factorial(x));
        }
        sc.close();
    }

    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        }
        long out = 1;
        for (int i = 2; i <= n; i++) {
            out = (out * i) % 4294967296L;
        }
        return out;



    }
}
