import java.util.*;
import java.io.*;
@SuppressWarnings("unused")

/**
 * CCC07j5
 */
public class CCC07j5 {
    static int maxDist;
    static int minDist;
    static int numHotels;
    static boolean[] hotel;
    static int[] ways;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] hotel = new boolean[7001];
        int[] ways = new int[7001];
        hotel[0] = true;
        hotel[990] = true;
        hotel[1010] = true;
        hotel[1970] = true;
        hotel[2030] = true;
        hotel[2940] = true;
        hotel[3060] = true;
        hotel[3930] = true;
        hotel[4060] = true;
        hotel[4970] = true;
        hotel[5030] = true;
        hotel[5990] = true;
        hotel[6010] = true;
        hotel[7000] = true;
        minDist = sc.nextInt();
        maxDist = sc.nextInt();
        numHotels = sc.nextInt();
        for (int i = 0; i < numHotels; i++) {
            int hotelDist = sc.nextInt();
            hotel[hotelDist] = true;
        }
        System.out.println(ways(7000));
        
    }

    public int ways(int hotelNum) {
        if (hotelNum == 7000) {
            return 1;
        }
        if (ways[hotelNum] != 0) {
            return ways[hotelNum];
        }
        for (int i = hotelNum + minDist; i <= hotelNum + maxDist; i++) {
            if (hotel[i]) {
                ways[hotelNum] += ways(i);
            }
        }
        return ways[hotelNum];
        
    }
}
