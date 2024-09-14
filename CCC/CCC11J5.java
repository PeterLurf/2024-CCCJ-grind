import java.util.*;


public class CCC11J5 {
    int[] arr ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //instance of non static fn
        CCC11J5 c = new CCC11J5();
        c.init(n);

        //size n-1 array
        for (int i = 0; i < n-1; i++) {
            System.out.println(i);
            int place = sc.nextInt();
            c.populate(place, i);
        }
        System.out.println(c.ways(n, n, sc.nextInt()));
        sc.close();

    }

    public void populate(int n,int i) {
        arr[i] = n;
    }

    public void init(int n) {
        arr = new int[n-1];
    }



    public int ways(int friends, int n, int x) {
        int ans = 1;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == x) {
                ans = ans * (1+ways(friends, n, i+1));
            }
        }
        return ans;
    }
}