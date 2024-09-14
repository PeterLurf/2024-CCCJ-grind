package TTMATH;

public class pascal {
    public static void main(String[] args) {
        //print out 100 rows of pascal triangle
        int[][] pascal = new int[100][100];

        pascal[0][0] = 1;
        System.out.println(pascal[0][0]);
        for (int i = 1; i < 40; i++) {
            pascal[i][0] = 1;
            System.out.print(pascal[i][0] + " ");
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                System.out.print(pascal[i][j] + "  "); // Add two spaces after each number
            }
            pascal[i][i] = 1;
            System.out.println(pascal[i][i]);
        }
    }
}
