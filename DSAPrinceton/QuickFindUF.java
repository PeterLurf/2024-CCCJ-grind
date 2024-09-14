package DSAPrinceton;
import java.util.*;
/*
 * QuickFindUF from Princeton DSA 
 * Initialize: O(N)
 * Union: O(N)
 * Find: O(1)
 */
public class QuickFindUF {
    public int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
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
        QuickFindUF qf = new QuickFindUF(N);
        while(true) {
            String s = sc.nextLine();
            // regex for if first word is union
            if (s.matches("union.*")) {
                String[] arr = s.split(" ");
                int p = Integer.parseInt(arr[1]);
                int q = Integer.parseInt(arr[2]);
                // union
                qf.union(p, q);
            }
            else if (s.matches("connect.*")) {
                String[] arr = s.split(" ");
                int p = Integer.parseInt(arr[1]);
                int q = Integer.parseInt(arr[2]);
                // connected
                System.out.println(qf.connected(p, q));
            }
            else if (s.matches("print.*")) {
                qf.print();
            }
            else {
                break;
            }

        }
        sc.close();
         
    }
    
}
