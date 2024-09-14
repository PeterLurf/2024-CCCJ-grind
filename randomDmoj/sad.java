package randomDmoj;
import java.util.*;
import java.io.*;
@SuppressWarnings("unused")

public class sad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        
       
        System.out.println(lower_bound(b) - lower_bound(a));

    }  2

    public static long Legendre(long n, long p) {
        long res = 0;
        while(n > 0) {
            n /= p;
            res += n;
        }
        return res;
    }

    public static long lower_bound( long p) {
        long l = 0;
        long r = 100000000000000L;
        while(l < r) {
            long m = (l + r) / 2;
            if(Legendre(m, p) >= r) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}
