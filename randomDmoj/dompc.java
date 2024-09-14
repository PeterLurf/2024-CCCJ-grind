package randomDmoj;

import java.util.Scanner;

@SuppressWarnings("unused")
public class dompc {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        char[][] arr = new char[x][y];
        int startX = sc.nextInt();
        int startY = sc.nextInt(); 
        int endX = sc.nextInt();
        int endY = sc.nextInt();
        for (int i = 0; i < x; i++) {
            String s = sc.next();
            for (int j = 0; j < y; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        int teleNum = sc.nextInt();
        for (int k = 0; k < teleNum; k++) {
            int teleX = sc.nextInt();
            int teleY = sc.nextInt();
            arr[teleX][teleY] = 'T';
        }
        //print the 2d array
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
            int sd = 0;
            double d = 0;
            String s = "hello";
        }
    }
}
