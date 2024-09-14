package randomDmoj;
import java.util.*;
@SuppressWarnings("unused")
public class huh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int totalB = 0;
            int totalA = 0;
            for (int j = 0; j < M; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a > totalA) {
                    totalA = a;
                }
                if (b > totalB) {
                    totalB = b;
                }

            }
            if (totalA + totalB > N) {
                System.out.println(-1);
            } else {
                for (int j = 0; j < totalA; j++) {
                    System.out.print("a");
                }
                for (int j = 0; j < totalB; j++) {
                    System.out.print("b");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
