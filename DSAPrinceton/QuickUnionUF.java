package DSAPrinceton;
import java.util.*;
/*
 * QuickUnionUF from Princeton DSA 
 * Initialize: O(N)
 * Union: O(N)
 * Find: O(N)
 */
public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
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
        id[i] = j;
    }

    public void print() {
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int N = sc.nextInt();
        sc.nextLine();
        QuickUnionUF qu = new QuickUnionUF(N);
        while(true) {
            String s = sc.nextLine();
            // regex for if first word is union
            if (s.matches("union.*")) {
                String[] arr = s.split(" ");
                int p = Integer.parseInt(arr[1]);
                int q = Integer.parseInt(arr[2]);
                // union
                qu.union(p, q);
            }
            else if (s.matches("connect.*")) {
                String[] arr = s.split(" ");
                int p = Integer.parseInt(arr[1]);
                int q = Integer.parseInt(arr[2]);
                // connected
                System.out.println(qu.connected(p, q));
            }
            else if (s.matches("print.*")) {
                qu.print();
            }
            else {
                break;
            }
        }
        sc.close();

    }
    
}
