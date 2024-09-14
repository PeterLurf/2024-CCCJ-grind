
import java.util.*;
import java.io.*;

public class CCC20S1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        float maxSpeed = 0;
        //sort by first value
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        //print out sorted array
        

        for (int i = 0; i < n - 1; i++) {
            float speed = Math.abs((float) (points[i + 1][1] - points[i][1]) / (points[i + 1][0] - points[i][0]));
            if (speed > maxSpeed) {
                maxSpeed = speed;
            }
        }
        System.out.println(maxSpeed);
        sc.close();
        
    }
}