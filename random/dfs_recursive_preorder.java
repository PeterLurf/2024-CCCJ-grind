package random;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class dfs_recursive_preorder {
    static int N = 7;
    static ArrayList<Integer>[] adjList;
    static boolean[] visited = new boolean[N];

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        adjList = new ArrayList[N];
//        System.out.println(Arrays.toString(visited));
        for (int i = 0; i < N; i++) {
            adjList[i] = new ArrayList<>();
        }

        adjList[1].addAll(Arrays.asList(2, 3, 4));
        adjList[2].addAll(Arrays.asList(1, 3));
        adjList[3].addAll(Arrays.asList(1, 2, 5, 6));
        adjList[4].addAll(Arrays.asList(1, 6));
        adjList[5].addAll(Arrays.asList(3, 6));
        adjList[6].addAll(Arrays.asList(3, 4, 5));
        // dfs(0);

        dfs(3);
        System.out.println(Arrays.toString(visited));
    }

    public static void dfs(int v) {
        visited[v] = true;
        System.out.println("visited " + v );
        for (int x : adjList[v])
            if (!visited[x]) {
                dfs(x);
            }
    }
}