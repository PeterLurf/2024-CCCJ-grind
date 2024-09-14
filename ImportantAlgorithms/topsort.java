import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 1. Create a visited array
 * 2. Starting from each unvisited vertex and perform recursive DFS down the graph to the end
 * while marking each visited vertex as true
 * 3. On the way back, push each vertex into a vector
 * 4. print the vector backward
 */
public class TopSort {
    static int N, M;
    static ArrayList<Integer>[] adjList;
    static boolean[] visited;
    static ArrayList<Integer> topoOrder = new ArrayList<>();

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        adjList = new ArrayList[N];
        visited = new boolean[N];
        M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++)
            adjList[i] = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            adjList[Integer.parseInt(st.nextToken())].add(Integer.parseInt(st.nextToken()));
        }
        for (int i = 0; i < N; i++)
            if (!visited[i])
                topSort(i);
        Collections.reverse(topoOrder);
        for (int i : topoOrder)
            System.out.println(i);

        System.out.println("path count: ");
        pathCount();
        System.out.println("shortest path: ");
        shortestPath();
        System.out.println("longest path:");
        longestPath();
    }

    public static void topSort(int v) {
        visited[v] = true;
        for (int i : adjList[v])
            if (!visited[i])
                topSort(i);
        topoOrder.add(v);
    }

    //   counting the number of paths to reach each vertex
    public static void pathCount() {
        int[] numOfPath = new int[N];
        for (int i : topoOrder) {
            if (numOfPath[i] == 0)
                numOfPath[i] = 1;
            for (int j = 0; i < N; i++)
                numOfPath[j] += numOfPath[i];
        }
        for (int i = 0; i < N; i++)
            System.out.println(i + " " + numOfPath[i]);
    }

    //    Finding the shortest path to reach each vertex
    public static void shortestPath() {
        int[] lengthToVertex = new int[N];
        for (int i = 0; i < N; i++)
            lengthToVertex[i] = 1000000000;
        for (int i : topoOrder) {
            if (lengthToVertex[i] == 1000000000)
                lengthToVertex[i] = 0;
            for (int j : adjList[i])
                lengthToVertex[j] = Math.min(lengthToVertex[j], lengthToVertex[i] + 1);
        }
        for (int i = 0; i < N; i++)
            System.out.println(i + " " + lengthToVertex[i]);
    }

    //    Finding the longest path to reach each vertex
    public static void longestPath() {
        int[] lengthToVertex = new int[N];
        for (int i : topoOrder) {
            for (int j : adjList[i])
                lengthToVertex[j] = Math.max(lengthToVertex[j], lengthToVertex[i] + 1);
        }
        for (int i = 0; i < N; i++)
            System.out.println(i + " " + lengthToVertex[i]);
    }

}