package TTMATH.Cs2;
import java.io.*;
public class class37 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  
        int n = Integer.parseInt(in.readLine());
        boolean[][] arr = new boolean[n][n];
        for (int i = 0; i<n; i++) {
            String s = in.readLine();
            for (int j = 0; j<n; j++) {
                if (s.charAt(j) == '#') {
                    arr[i][j] = true;
                }
                else if (s.charAt(j) == '.') {
                    arr[i][j] = false;
                }
            }
        }
        
        int[][] dp = new int[n][n];
        

    }
    public static boolean isTriangle(boolean[][] arr, int x, int y, int size) {
        
        for (int j = y; j<y+1+size/2; j++) {
            for (int i = x-size/2; i<x+size/2; i++) {
                
            }     
        }
        return true;
    }

   
}
