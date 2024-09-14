package TTMATH;
import java.util.*;
import java.io.*;
@SuppressWarnings("unused")

public class TopologicalSort {
    static int n;
    static int m;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static ArrayList<Integer> Topo_order = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        adj = new ArrayList[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj[a].add(b);
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }
        Collections.reverse(Topo_order);
        System.out.println(Topo_order);
        sc.close();
        
    }

    public static void dfs(int v) {
        visited[v] = true;
        for (int x : adj[v]) {
            if (!visited[x]) {
                dfs(x);
            }
        }
        Topo_order.add(v);
    }
}
