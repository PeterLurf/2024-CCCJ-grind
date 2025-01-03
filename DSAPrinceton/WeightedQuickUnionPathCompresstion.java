package DSAPrinceton;
import java.util.*;

/* 
 * WeightedQuickUnionPathCompresstion from Princeton DSA
 * Initialize: O(N)
 * Union: O(logN)
 * Find: O(logN)
 */
public class WeightedQuickUnionPathCompresstion {

    private int[] id;
    private int[] sz;

    public WeightedQuickUnionPathCompresstion(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p , int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) {
            return;
        }
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        }
        else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    public void print() {
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // repalce code with bufferedReader
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int N = sc.nextInt();
        sc.nextLine();
        WeightedQuickUnionPathCompresstion wqu = new WeightedQuickUnionPathCompresstion(N);
        while(true) {
            String s = sc.nextLine();
            // regex for if first word is union
            if (s.matches("union.*")) {
                String[] arr = s.split(" ");
                int p = Integer.parseInt(arr[1]);
                int q = Integer.parseInt(arr[2]);
                // union
                wqu.union(p, q);
            }
            else if (s.matches("connect.*")) {
                String[] arr = s.split(" ");
                int p = Integer.parseInt(arr[1]);
                int q = Integer.parseInt(arr[2]);
                // connected
                System.out.println(wqu.connected(p, q));
            }
            else if (s.matches("print.*")) {
                wqu.print();
            }
            else {
                break;
            }
        }
        sc.close();
    }
    
}
