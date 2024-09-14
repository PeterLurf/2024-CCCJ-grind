package TTMATH.Cs2;
import java.util.*;
import java.io.*;
@SuppressWarnings("all")

public class class35 {
    //greedy algorthm 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i<5; i++) {
            int num_zeros = 0;
            int n = in.nextInt();
            int[] grarr = new int[n];
            int[] orderd = new int[n];
            int counted = 0;

            for (int j = 0; j<n; j++) {
                grarr[j] = in.nextInt();
                if (grarr[j] == 0) {
                    num_zeros++;
                }
            }
            if (num_zeros == 0) {
                System.out.println("IMPOSSIBLE");
                continue;
            }
            while (counted < n) {
                for (int j =0; j<n; i++) {
                    //left most zero
                    if (grarr[j] == 0) {
                        orderd[j] = n-counted;
                        counted++;
                        //subtract all elements before j by 1
                        for (int k = 0; k<j; k++) {
                            grarr[k]--;
                        }
                        break;
                    }
                }
            }

            //pritn the orderd array
            for (int j = 0; j<n; j++) {
                System.out.print(orderd[j] + " ");
            }
        }
    }
}
